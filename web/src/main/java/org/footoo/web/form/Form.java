/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.web.form;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.footoo.common.log.Logger;
import org.footoo.common.log.LoggerFactory;
import org.footoo.common.propertyConvetor.IntPropertyConvetor;
import org.footoo.common.propertyConvetor.PropertyConvetor;
import org.footoo.common.propertyConvetor.PropertyConvetorException;
import org.footoo.common.propertyConvetor.StringPropertyConvetor;

/**
 * 表单
 * 
 * @author jeff
 * @version $Id: Form.java, v 0.1 2014年3月24日 上午11:06:55 jeff Exp $
 */
public class Form {
    /** 用于将字符串转换为对应的数据类型 */
    private static final Map<Class<?>, PropertyConvetor> conventors = new HashMap<Class<?>, PropertyConvetor>();

    /** 日志 */
    private static final Logger                          logger     = LoggerFactory
                                                                        .getLogger(Form.class);

    static {
        //设置默认的属性编辑器
        //Int
        conventors.put(Integer.class, new IntPropertyConvetor());
        conventors.put(Integer.TYPE, new IntPropertyConvetor());
        //Char

        //String
        conventors.put(String.class, new StringPropertyConvetor());
    }

    /**
     * 给表单赋属性,支持表单对象的继承
     * 
     * @param paramaters
     * @throws FormException
     */
    @SuppressWarnings("null")
    public void assignAttrs(Map<String, String> paramaters) throws FormException {
        Class<?>[] clzs = findInheritChain();

        //遍历所有的请求参数项
        for (String key : paramaters.keySet()) {
            Field field = findField(clzs, key);
            if (field == null) {
                continue;
            }
            //进行Field检查
            fieldTypeChecker(paramaters.get(key), field);

            //获取set方法
            Method method = findMethod(clzs, createSetMethodName(key), field);
            if (method != null) {
                //转换为所需的参数
                PropertyConvetor propertyConvetor = conventors.get(field.getType());
                if (propertyConvetor == null) {
                    throw new FormException("没有[" + field.getType().getName() + "]的转换函数");
                }
                try {
                    Object param = propertyConvetor.convetor(paramaters.get(key));
                    //logger.debug(param);
                    //调用set方法
                    method.invoke(this, param);
                } catch (PropertyConvetorException e) {
                    throw new FormException(e.getMessage());
                } catch (Exception e) {
                    logger.warn(e, "调用set函数发异常");
                }
            }
        }

        //进行required域校验
        for (Class<?> clz : clzs) {
            requredValidate(clz, paramaters);
        }
    }

    /**
     * field校验
     * 
     * @param str
     * @param field
     * @throws FormException
     */
    private void fieldTypeChecker(String str, Field field) throws FormException {
        FormAttribute formAttribute = field.getAnnotation(FormAttribute.class);
        if (formAttribute == null) {
            return;
        }
        for (FormFieldEnum fieldEnum : formAttribute.type()) {
            //获得校验器
            FormValidator validator = fieldEnum.getValidator();
            if (!validator.validate(str)) {
                throw new FormException(str + " 无法通过 " + validator.getName() + " 的校验");
            }
        }

    }

    /**
     * 获取set方法
     * 
     * @param field
     * @return
     */
    private String createSetMethodName(String field) {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("set");
        //首字母大写
        char c = field.charAt(0);
        if (c >= 'a' && c <= 'z') {
            c += 'A' - 'a';
        }
        stringBuffer.append(c);

        stringBuffer.append(field.substring(1));

        return stringBuffer.toString();
    }

    /**
     * 寻找field
     * 
     * @param clzs
     * @param fieldName
     * @return
     */
    private Field findField(Class<?>[] clzs, String fieldName) {
        for (Class<?> clz : clzs) {
            try {
                Field field = clz.getDeclaredField(fieldName);
                if (field != null) {
                    return field;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        return null;
    }

    /**
     * 获取Set方法
     * 
     * @param clzs
     * @param methodName
     * @param field
     * @return
     */
    private Method findMethod(Class<?>[] clzs, String methodName, Field field) {
        for (Class<?> clz : clzs) {
            try {
                Method method = clz.getDeclaredMethod(methodName, field.getType());
                if (method != null) {
                    return method;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        return null;
    }

    /**
     * 获取继承链，直到Form(不包括)
     * 
     * @return
     */
    private Class<?>[] findInheritChain() {
        List<Class<?>> clzs = new ArrayList<Class<?>>();
        Class<?> clz = this.getClass();

        while (!clz.equals(Form.class)) {
            clzs.add(clz);
            clz = clz.getSuperclass();
        }
        Class<?>[] result = new Class<?>[clzs.size()];
        return clzs.toArray(result);
    }

    /**
     * 对必须的数据项进行校验
     * 
     * @param cls
     * @param paramaters
     * @throws FormException
     */
    private void requredValidate(Class<?> cls, Map<String, String> paramaters) throws FormException {
        //所有的数据域
        Field[] fields = cls.getDeclaredFields();

        //遍历所有的属性
        for (Field field : fields) {
            //获取注解
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                //是表单属性
                if (annotation.annotationType().equals(FormAttribute.class)) {
                    FormAttribute formAttribute = (FormAttribute) annotation;
                    //进行校验
                    if (formAttribute.required() && !paramaters.containsKey(field.getName())) {
                        throw new FormException("参数没有 " + field.getName());
                    }

                }
            }
        }
    }
}
