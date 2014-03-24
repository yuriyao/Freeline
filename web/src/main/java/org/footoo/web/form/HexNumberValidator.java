/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.web.form;

import org.footoo.common.dataUtil.StringUtil;

/**
 * 十六进制字符串
 * 
 * @author jeff
 * @version $Id: HexNumberValidator.java, v 0.1 2014年3月24日 下午3:56:15 jeff Exp $
 */
public class HexNumberValidator implements FormValidator {

    /** 
     * @see org.footoo.web.form.FormValidator#validate(java.lang.String)
     */
    @Override
    public boolean validate(String str) {
        if (str == null) {
            return true;
        }
        return StringUtil.isHexNumber(str);
    }

    /** 
     * @see org.footoo.web.form.FormValidator#getName()
     */
    @Override
    public String getName() {
        return "十六进制校验器";
    }

}
