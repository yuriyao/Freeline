/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.web.form;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Form数据域的属性
 * 
 * @author jeff
 * @version $Id: FormAttribute.java, v 0.1 2014年3月24日 下午3:21:49 jeff Exp $
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FormAttribute {
    /**
     * 数据域是否是必须的
     * 
     * @return
     */
    public boolean required() default false;
    
    /**
     * form的数据类型
     * 
     * @return
     */
    public FormFieldEnum[] type() default {};
}
