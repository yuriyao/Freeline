/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.biz.user;

import java.util.Date;

/**
 * 用户的基本信息
 * 
 * @author jeff
 * @version $Id: UserBaseInfo.java, v 0.1 2014年3月31日 下午9:13:49 jeff Exp $
 */
public class UserBaseInfo {
    /** 女性 */
    public static final int SEX_FEMALE = 0;
    /** 男性 */
    public static final int SEX_MALE   = 1;
    /** 性别保密 */
    public static final int SEX_OTHER  = 2;

    /** 用户的nickName,可以中文，可以重复 */
    private String          nickName;
    /** 性别 */
    private int             sex;
    /** 出生时间 */
    private Date            born;

    /**
     * Getter method for property <tt>nickName</tt>.
     * 
     * @return property value of nickName
     */
    public final String getNickName() {
        return nickName;
    }

    /**
     * Setter method for property <tt>nickName</tt>.
     * 
     * @param nickName value to be assigned to property nickName
     */
    public final void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * Getter method for property <tt>sex</tt>.
     * 
     * @return property value of sex
     */
    public final int getSex() {
        return sex;
    }

    /**
     * Setter method for property <tt>sex</tt>.
     * 
     * @param sex value to be assigned to property sex
     */
    public final void setSex(int sex) {
        this.sex = sex;
    }

    /**
     * Getter method for property <tt>born</tt>.
     * 
     * @return property value of born
     */
    public final Date getBorn() {
        return born;
    }

    /**
     * Setter method for property <tt>born</tt>.
     * 
     * @param born value to be assigned to property born
     */
    public final void setBorn(Date born) {
        this.born = born;
    }

}
