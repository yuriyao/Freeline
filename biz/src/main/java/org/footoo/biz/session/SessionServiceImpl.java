/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.biz.session;

/**
 * 实现会话服务
 * 
 * @author jeff
 * @version $Id: SessionServiceImpl.java, v 0.1 2014年3月31日 下午10:08:44 jeff Exp $
 */
public class SessionServiceImpl implements SessionService {

    /** 单例 */
    private static final SessionServiceImpl sessionService = new SessionServiceImpl();

    /**
     * 获取单例
     * 
     * @return
     */
    public static final SessionService createSessionService() {
        return sessionService;
    }

    private SessionServiceImpl() {

    }

    /** 
     * @see org.footoo.biz.session.SessionService#createSessionForUser(java.lang.String)
     */
    @Override
    public Session createSessionForUser(String userName) {
        return null;
    }

    /** 
     * @see org.footoo.biz.session.SessionService#createSessionForUser(java.lang.String, long)
     */
    @Override
    public Session createSessionForUser(String userName, long timeouts) {
        return null;
    }

    /** 
     * @see org.footoo.biz.session.SessionService#getSession(org.footoo.biz.session.SessionID)
     */
    @Override
    public Session getSession(SessionID sessionID) {
        return null;
    }

}
