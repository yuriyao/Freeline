/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.web.form;

import org.footoo.common.dataUtil.StringUtil;

/**
 * 纯数据校验器
 * null字符串可以通过
 * 
 * @author jeff
 * @version $Id: NumberValidator.java, v 0.1 2014年3月24日 下午3:28:48 jeff Exp $
 */
public class NumberValidator implements FormValidator {

    /** 
     * @see org.footoo.web.form.FormValidator#validate(java.lang.String)
     */
    @Override
    public boolean validate(String str) {
        if (str == null) {
            return true;
        }
        return StringUtil.isNumber(str);
    }

    /** 
     * @see org.footoo.web.form.FormValidator#getName()
     */
    @Override
    public String getName() {
        return "数字校验器";
    }

}
