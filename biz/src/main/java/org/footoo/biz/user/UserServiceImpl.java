/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.biz.user;

/**
 * 
 * @author jeff
 * @version $Id: UserServiceImpl.java, v 0.1 2014年3月24日 上午12:06:14 jeff Exp $
 */
public class UserServiceImpl implements UserService {

    @Override
    public boolean login(UserLoginInfo userLoginInfo) {
        return false;
    }

    @Override
    public boolean registerSimple(UserLoginInfo userLoginInfo) {
        return false;
    }

    @Override
    public boolean hasRegister(String userName) {
        return false;
    }

}
