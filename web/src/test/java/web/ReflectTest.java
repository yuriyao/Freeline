/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package web;

import java.lang.reflect.Field;

/**
 * 
 * @author jeff
 * @version $Id: ReflectTest.java, v 0.1 2014年3月24日 下午7:12:00 jeff Exp $
 */
public class ReflectTest {
    public static void main(String args[]) throws SecurityException, NoSuchFieldException,
                                          IllegalArgumentException, IllegalAccessException {
        Field field = B.class.getDeclaredField("field");

        System.out.println(field.get(new B()) != null);
    }
}

class B extends A {
    int d;
}

class A {
    int        field = 3;
    static int s     = 4;
}
