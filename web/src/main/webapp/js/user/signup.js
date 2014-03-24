/**
 * 注册的js
 */
//注册
function signup() {
	var userName = $("#username").val();
	var pwd = $("#password").val();
	var pwd_re = $("#password_re").val();
	var email = $("#email").val();
	
	
	
	//进行参数合法性检测
	if(pwd != pwd_re) {
		$("#tips").text("密码前后不一致");
		return;
	}else {
		$("#tips").text("");
	}
	
	//异步发送数据
	$.post("/signup", {username : userName, password : pwd, email : email}, 
		function(data) {
		
		}, "json"
	);
}

$(document).ready(function() {
	
	
})