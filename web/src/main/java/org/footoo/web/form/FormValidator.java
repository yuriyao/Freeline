/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.web.form;

/**
 * 表单校验器
 * 
 * @author jeff
 * @version $Id: FormValidator.java, v 0.1 2014年3月24日 下午3:26:42 jeff Exp $
 */
public interface FormValidator {
    /**
     * 表单字符串校验
     * 
     * @param str
     * @return
     */
    public boolean validate(String str);

    /**
     * 校验器的名字
     * 
     * @return
     */
    public String getName();
}
