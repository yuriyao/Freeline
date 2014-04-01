/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.biz.test;

import redis.clients.jedis.Jedis;

/**
 * redis测试
 * 
 * @author jeff
 * @version $Id: RedisTest.java, v 0.1 2014年3月31日 下午10:29:52 jeff Exp $
 */
public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("helloworld", "fuck");
        System.out.println(jedis.get("helloworld"));
    }
}
