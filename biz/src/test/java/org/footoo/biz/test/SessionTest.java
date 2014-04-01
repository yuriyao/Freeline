/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.biz.test;

import org.footoo.biz.session.SessionID;

/**
 * 
 * @author jeff
 * @version $Id: SessionTest.java, v 0.1 2014年3月31日 下午9:51:42 jeff Exp $
 */
public class SessionTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SessionID sessionID = new SessionID();
            System.out.println(sessionID.getSessionId());
        }
    }
}
