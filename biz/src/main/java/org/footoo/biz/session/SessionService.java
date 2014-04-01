/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.biz.session;

/**
 * 会话服务
 * 
 * @author jeff
 * @version $Id: SessionService.java, v 0.1 2014年3月31日 下午10:00:23 jeff Exp $
 */
public interface SessionService {

    /** 默认超时时间（一天） */
    public static final long DEFAULT_TIMEOUTS = 24 * 3600;

    /**
     * 为用户创建会话，使用默认的超时时间
     * 
     * @param userName
     * @return
     */
    public Session createSessionForUser(String userName);

    /**
     * 为用户创建会话
     * 
     * @param userName 用户名
     * @param timeouts 超时时间
     * @return
     */
    public Session createSessionForUser(String userName, long timeouts);

    /**
     * 由sessionID获取session
     * 
     * @param sessionID
     * @return
     */
    public Session getSession(SessionID sessionID);
}
