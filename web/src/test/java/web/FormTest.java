/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package web;

import java.util.HashMap;
import java.util.Map;

import org.footoo.web.form.FormException;

/**
 * 
 * @author jeff
 * @version $Id: FormTest.java, v 0.1 2014年3月24日 下午8:06:45 jeff Exp $
 */
public class FormTest {
    public static final void main(String[] args) throws FormException {
        Map<String, String> map = new HashMap<String, String>();
        map.put("userName", "123");
        map.put("password", "23434");
        map.put("age", "32");
        map.put("school", "123");
        LoginForm2 loginForm = new LoginForm2();

        loginForm.assignAttrs(map);

        System.out.println(loginForm.getPassword() + " " + loginForm.getAge());
    }
}
