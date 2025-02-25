<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<c:set var="url">${pageContext.request.contextPath}</c:set>
		<title>健康网管理系统</title>
		<link href="${url}/style/backmain.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="${url}/js/clock.js">
</script>
		<script type="text/javascript">
function goTo(actionName) {
	document.getElementById("tabframe").src = "${pageContext.request.contextPath}/back/back_"+ actionName;
}
</script>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"5635",secure:"5644"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-4" data-genuitec-path="/Healthy_manager/WebRoot/back_main.jsp">
		<div class="top_img" align="right" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-4" data-genuitec-path="/Healthy_manager/WebRoot/back_main.jsp">
			<div id="clock">
			</div>
		</div>

		<div class="mid">
			<div class="left">
				<div class="left2_1">
					<img src="${url}/images/left2_01.jpg" />
				</div>
				<div class="left2_2">
					<ul>
						<li>
							<span>系统管理</span>
						</li>
						<li>
							<a onClick="goTo('manager')">管理员管理</a>
						</li>
						<li>
							<a onClick="goTo('notice')">健康新闻管理</a>
						</li>
						<li>
							<span>教师管理</span>
						</li>
						<li>
							<a onClick="goTo('teacher')">教师个人信息管理</a>
						</li>
						<li>
							<a onClick="goTo('exam')">教师体检信息管理</a>
						</li>
					</ul>
				</div>
				<div class="left2_1">
					<img src="${url}/images/left2_02.jpg" />
				</div>
			</div>

			<div class="right">
				<div class="right1">
					现在的位置:
				</div>
				<div class="right2" align="center">
					<div class="right2_tt" align="left">
						<iframe id="tabframe" height="100%" width="100%" frameborder="0" 
							src="${url}/back_welcome.jsp">
							浏览器不支持嵌入式框架，或被配置为不显示嵌入式框架。
						</iframe>
					</div>
				</div>
				<div class="right3">
					<img src="${url}/images/right_b_03.jpg" />
				</div>
			</div>
		</div>

		<div style="clear: both;"></div>
		<div id="foot" align="center">
			<div id="copyright">
				<div id="copy">
					<p>
						<font size=3px; color=#666666;> CopyRight&copy; 湖南理工学院</font>
					</p>

				</div>
			</div>
			<div id="bgbottom"></div>
		</div>
	</body>
</html>
