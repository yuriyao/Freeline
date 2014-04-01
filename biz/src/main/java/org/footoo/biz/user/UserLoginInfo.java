/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.biz.user;

/**
 * 用户登陆信息
 * 
 * @author jeff
 * @version $Id: UserLoginInfo.java, v 0.1 2014年3月31日 下午8:56:33 jeff Exp $
 */
public class UserLoginInfo {
    /** 用户名,这里使用用户的注册邮箱 */
    private String userName;

    /** 用户密码 */
    private String pwd;

    public UserLoginInfo() {

    }

    /**
     * @param userName
     * @param pwd
     */
    public UserLoginInfo(String userName, String pwd) {
        super();
        this.userName = userName;
        this.pwd = pwd;
    }

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
     * Getter method for property <tt>pwd</tt>.
     * 
     * @return property value of pwd
     */
    public final String getPwd() {
        return pwd;
    }

    /**
     * Setter method for property <tt>pwd</tt>.
     * 
     * @param pwd value to be assigned to property pwd
     */
    public final void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
