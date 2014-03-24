/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.web.form;

/**
 * email校验器
 * 
 * @author jeff
 * @version $Id: EmailValidator.java, v 0.1 2014年3月24日 下午4:08:42 jeff Exp $
 */
public class EmailValidator implements FormValidator {

    /** 
     * @see org.footoo.web.form.FormValidator#validate(java.lang.String)
     */
    @Override
    public boolean validate(String str) {
        return true;
    }

    /** 
     * @see org.footoo.web.form.FormValidator#getName()
     */
    @Override
    public String getName() {
        return "email校验器";
    }

}
