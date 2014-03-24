<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册FL</title>

<!-- JS -->
<script type="text/javascript" src="/Freeline/js/jquery/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="/Freeline/js/user/signup.js"></script>
<!-- CSS -->
</head>
<body>
	<div id="tips"></div>
	<table>
		<tr>
			<td id="username_label">用户名:</td>
			<td id="username_input"><input type="text" name="username" id="username"/></td>
		</tr>
		<tr>
			<td id="password_label">密码:</td>
			<td id="password_input"><input type="password" name="password" id="password"/></td>
		</tr>
		<tr>
			<td id="password_re_label">重新输入密码:</td>
			<td id="password_re_input"><input type="password" name="password_re" id="password_re"/></td>
		</tr>
		<tr>
			<td id="email_label">e-mail:</td>
			<td id="email_input"><input type="text" name="email" id="email" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><button id="submit" onclick="return signup()">提交</button>&nbsp;<a href="login.jsp">登陆</a></td>
		</tr>
	</table>
</body>
</html>