/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.web.form;

/**
 * 表单异常
 * 
 * @author jeff
 * @version $Id: FormException.java, v 0.1 2014年3月24日 下午4:28:26 jeff Exp $
 */
public class FormException extends Exception {

    /**  */
    private static final long serialVersionUID = 6610336814267344905L;

    /**
     * 
     */
    public FormException() {
    }

    /**
     * @param message
     */
    public FormException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public FormException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public FormException(String message, Throwable cause) {
        super(message, cause);
    }

}
