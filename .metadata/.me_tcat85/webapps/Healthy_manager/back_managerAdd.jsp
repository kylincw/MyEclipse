<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<c:set var="url">${pageContext.request.contextPath}</c:set>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<script type="text/javascript" src="${url}/js/jquery-1.10.2.js"></script>
		<style type="text/css">
table{width: 100%;}
.head{
padding-left:20px;
	font-size:18px;
	font-weight:bold;
	color:#F63;
	height:32px;
}
.lable {
	height:34px;
	font-size:14px;
	color:#666666;
	text-align:right;
	width: 20%;
}
.text {
font-size:16px;
	margin-left:10px;
	border-left:none;
	border-top:none;
	border-right:none;
	border-bottom:1px solid #999;
}
.infor {
	width:45%;
}
.font_error {
	font-size:12px;
	color:#ff0000;
}
.font_true {
	font-size:12px;
	color:#61b16a;
}
input.login_btn {
	border: 0px;
	cursor: pointer;
	font-size: 14px ;
	margin-left: 150px ;
	padding: 7px 18px ;
	text-decoration: none ;
	background: none repeat scroll 0 0 #FF8500;
	color: #FFFFFF;
	float: left ;
}
		</style>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"5635",secure:"5644"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-6" data-genuitec-path="/Healthy_manager/WebRoot/back_managerAdd.jsp">

<div class="head" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-6" data-genuitec-path="/Healthy_manager/WebRoot/back_managerAdd.jsp">管理员添加：</div>
	<form id="register" method="post" >
	<table border="0">
	<tr>
	<td class="lable">登录用户：</td>
	<td><input type="text" name="manager.name" id="username" class="text"></td>
	<td><div id="userinfor"  class="infor"></div></td>
	</tr>
	<tr>
	<td class="lable">登录密码：</td>
	<td><input type="password" name="manager.password" id="pwd" class="text"></td>
	<td><div id="pwdinfor"  class="infor"></div></td>
	</tr>
	<tr>
	<td class="lable">请再次输入密码：</td>
	<td><input type="password" id="repwd" class="text"></td>
	<td><div id="repwdinfor"  class="infor"></div></td>
	</tr>
	<tr>
	<td colspan="3"><input type="button" id="register_button" class="login_btn" value="添加"></td>
	</tr>
	</table>
	</form>

	</body>
	<script type="text/javascript">
	$(document).ready(function() {
		var flag1 = false;
		var flag2 = false;
		var flag3 = false;
					$("#username").blur(
							function() {
								var name = $("#username").val();
								$("#userinfor").removeClass();
								$("#userinfor").addClass("font_error");
								var reg = /^[A-Za-z0-9_]+$/;
								if (name.length > 16 || name.length < 2) {
									$("#userinfor").html("用户名长度必须为2—16位");
									flag1 = false;
									return false;
								}
								if (!reg.test(name)) {
									$("#userinfor").html("用户名只能由字母、数字、下划线组成！");
									flag1 = false;
									return false;
								}
								$("#userinfor").html(
										"<img src='./images/icon04.gif'>");
								flag1 = true;
								return true;
							});

					$("#pwd").blur(function() {
						var pwd = $("#pwd").val();
						$("#pwdinfor").removeClass();
						$("#pwdinfor").addClass("font_error");
						var pattern = /^[A-Za-z0-9_!@#$%^&*()]+$/;
						if (pwd.length < 6) {
							$("#pwdinfor").html("密码不能少于6位");
							flag2 = false;
							return false;
						}
						if (!pattern.test(pwd)) {
							$("#pwdinfor").html("密码只能是字母、数子、特殊符号组成！");
							flag2 = false;
							return false;
						}
						$("#pwdinfor").addClass("font_true");
						$("#pwdinfor").html("密码有效！");
						flag2 = true;
						return true;
					});

					$("#repwd").blur(
							function() {
								var pwd = $("#pwd").val();
								var repwd = $("#repwd").val();
								$("#repwdinfor").removeClass();
								$("#repwdinfor").addClass("font_error");
								if (repwd == "") {
									$("#repwdinfor").html("请再输入一次您的密码！");
									flag3 = false;
									return false;
								}
								if (pwd != repwd) {
									$("#repwdinfor").html(
											"两次输入的密码不一致，<br>请重新输入！");
									flag3 = false;
									return false;
								}
								$("#repwdinfor").html(
										"<img src='./images/icon04.gif'>");
								flag3 = true;
								return true;
							});
					$("#register_button").click(function() {
										if (flag1 && flag2 && flag3 ) {
											$("#register").attr("action","${url}/back/add_manager").submit();
										} else {
											alert("请填写有效信息！");
											return false;
										}
									});
				})
	</script>
</html>
