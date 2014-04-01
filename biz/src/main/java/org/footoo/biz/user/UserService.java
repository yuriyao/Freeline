/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.biz.user;

/**
 * 用户服务接口
 * 
 * @author jeff
 * @version $Id: UserService.java, v 0.1 2014年3月24日 上午12:03:05 jeff Exp $
 */
public interface UserService {

    /**
     * 用户登陆
     * 
     * @param userLoginInfo
     * @return
     */
    public boolean login(UserLoginInfo userLoginInfo);

    /**
     * 简洁用户注册模式
     * 
     * @param userLoginInfo 只注册用户的登陆基本信息
     * @return
     */
    public boolean registerSimple(UserLoginInfo userLoginInfo);

    /**
     * 用户名是否已经被注册
     * 
     * @param userName
     * @return
     */
    public boolean hasRegister(String userName);

}
