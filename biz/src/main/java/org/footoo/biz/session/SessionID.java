/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.biz.session;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 会话ID
 * 
 * @author jeff
 * @version $Id: SessionID.java, v 0.1 2014年3月31日 下午9:31:44 jeff Exp $
 */
public class SessionID {
    /** 会话ID */
    private final String            sessionId;

    /** 序列 */
    private static final AtomicLong sequence = new AtomicLong(0);

    public SessionID(String sessionId) {
        this.sessionId = sessionId;
    }

    public SessionID() {
        this(generateSessionId());
    }

    /**
     * Getter method for property <tt>sessionId</tt>.
     * 
     * @return property value of sessionId
     */
    public final String getSessionId() {
        return sessionId;
    }

    /**
     * 生成一个会话ID
     * <ul>
     * <li>会话ID构成</li>
     * <li>时间<li>
     * <li>序列<li>
     * <li>随机数<li>
     * <li>随机数<li>
     * <li>随机数<li>
     * </ul>
     * 
     * @return
     */
    public static final String generateSessionId() {

        StringBuffer result = new StringBuffer();

        //生成时间
        result.append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        //序列
        result.append(formatLong(sequence.incrementAndGet()));
        //随机数
        for (int i = 0; i < 3; i++) {
            result.append(formatLong((long) (Math.random() * Long.MAX_VALUE)));
        }

        return result.toString();
    }

    /**
     * 格式化long
     * 
     * @param l
     * @return
     */
    public static final String formatLong(long l) {
        String string = Long.toHexString(l);
        //填充到20位
        int fillLen = 20 - string.length();
        //不会有太多操作，就不用StringBuffer了
        for (int i = 0; i < fillLen; i++) {
            string = "0" + string;
        }
        return string;
    }
}
