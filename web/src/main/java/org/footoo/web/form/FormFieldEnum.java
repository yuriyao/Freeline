/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.web.form;

/**
 * FormFiled的校验器
 * 
 * @author jeff
 * @version $Id: FormFieldEnum.java, v 0.1 2014年3月24日 下午3:25:49 jeff Exp $
 */
public enum FormFieldEnum {
    /** 纯数字串 */
    NUMBER_FIELD(0, new NumberValidator()),
    /** 十六进制字符串 */
    HEX_NUMBER_FIELD(1, new HexNumberValidator()),
    /** Email */
    EMAIL_FIELD(2, new EmailValidator()),
    ;
    
    private int code;
    private FormValidator validator;

    private FormFieldEnum(int code, FormValidator validator) {
        this.code = code;
        this.validator = validator;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public final int getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public final void setCode(int code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>validator</tt>.
     * 
     * @return property value of validator
     */
    public final FormValidator getValidator() {
        return validator;
    }

    /**
     * Setter method for property <tt>validator</tt>.
     * 
     * @param validator value to be assigned to property validator
     */
    public final void setValidator(FormValidator validator) {
        this.validator = validator;
    }
    
    
}
