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
     * @param userName
     * @param pwd
     * @return
     */
    public boolean login(String userName, String pwd);
}
