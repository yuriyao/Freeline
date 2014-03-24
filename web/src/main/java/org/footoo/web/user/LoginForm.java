/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.web.user;

import org.footoo.web.form.Form;
import org.footoo.web.form.FormAttribute;
import org.footoo.web.form.FormFieldEnum;

/**
 * 登陆form
 * 
 * @author jeff
 * @version $Id: LoginForm.java, v 0.1 2014年3月24日 下午3:52:34 jeff Exp $
 */
public class LoginForm extends Form {
    /** 用户名，登陆用户名必须是用户的email */
    @FormAttribute(required = true, type = { FormFieldEnum.EMAIL_FIELD })
    private String userName;
    /** 用户密码， 经过加密，为全16进制 */
    @FormAttribute(required = true, type = { FormFieldEnum.HEX_NUMBER_FIELD })
    private String password;
    
    /**
     * Getter method for property <tt>userName</tt>.
     * 
     * @return property value of userName
     */
    public final String getUserName() {
        return userName;
    }
    /**
     * Setter method for property <tt>userName</tt>.
     * 
     * @param userName value to be assigned to property userName
     */
    public final void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * Getter method for property <tt>password</tt>.
     * 
     * @return property value of password
     */
    public final String getPassword() {
        return password;
    }
    /**
     * Setter method for property <tt>password</tt>.
     * 
     * @param password value to be assigned to property password
     */
    public final void setPassword(String password) {
        this.password = password;
    }
    
    
}
