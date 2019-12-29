<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<STYLE>
h1 {
	margin: 0;
	padding: 40px 0 0 40px;
	color: #999898;
	font: bold 36px/ 1.2em Arial, Helvetica, sans-serif;
	text-transform: uppercase;
	letter-spacing: -2px;
	color: #999898;
	text-decoration: none;
}
h1 span {
	color: #ea5d00;
	font-size: 50px;
}
</STYLE>
<c:if test="${!empty errorMessage}">
<script type="text/javascript">
  alert('${errorMessage}');
  </script>
</c:if>
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-12" data-genuitec-path="/Healthy_manager/WebRoot/back_welcome.jsp">
  <h2 data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-12" data-genuitec-path="/Healthy_manager/WebRoot/back_welcome.jsp">欢迎来到:</h2>
	<br/>
		<h1>
			&nbsp;&nbsp;<span>HNLG</span>&nbsp;健康平台后台管理
		</h1>
	</body>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"5635",secure:"5644"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></html>
