/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.biz.session;

/**
 * 用户会话
 * 
 * @author jeff
 * @version $Id: Session.java, v 0.1 2014年3月31日 下午9:30:30 jeff Exp $
 */
public class Session {
    /** 用户的会话ID */
    private SessionID sessionID;
    /** 用户名 */
    private String    userName;

    /**
     * Getter method for property <tt>sessionID</tt>.
     * 
     * @return property value of sessionID
     */
    public final SessionID getSessionID() {
        return sessionID;
    }

    /**
     * Setter method for property <tt>sessionID</tt>.
     * 
     * @param sessionID value to be assigned to property sessionID
     */
    public final void setSessionID(SessionID sessionID) {
        this.sessionID = sessionID;
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

}
