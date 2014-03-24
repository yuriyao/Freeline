/**
 * IBMTC HIT 
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package org.footoo.web.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.footoo.biz.user.UserService;
import org.footoo.biz.user.UserServiceImpl;
import org.footoo.common.log.Logger;
import org.footoo.common.log.LoggerFactory;

/**
 * 登陆的处理函数
 * 
 * @author jeff
 * @version $Id: LoginServlet.java, v 0.1 2014年3月24日 上午12:20:58 jeff Exp $
 */
public class LoginServlet extends HttpServlet {
    /**  */
    private static final long        serialVersionUID = 3459681049535001967L;

    /** 用户服务 */
    private static final UserService userService      = new UserServiceImpl();

    /** 日志 */
    private static final Logger      logger           = LoggerFactory.getLogger(LoginServlet.class);

    /**
     * 
     * 
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
                                                                                throws ServletException,
                                                                                IOException {
        //获取用户名
        String userName = request.getParameter("username");
        String pwd = request.getParameter("password");
        response.setCharacterEncoding("utf8");

        if (userService.login(userName, pwd)) {
            logger.debug(userName + "登陆成功");
            logger.debug(request.getParameterMap().get("username"));
            response
                .getWriter()
                .println(
                    "<html><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> <title>成功</title></html>");
            response.getWriter().close();
        } else {
            logger.debug(userName + "登陆失败");
            response
                .getWriter()
                .println(
                    "<html><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>失败</title></html>");
            response.getWriter().close();
        }
    }
}
