<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<c:set var="url">${pageContext.request.contextPath}</c:set>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"5635",secure:"5644"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-9" data-genuitec-path="/Healthy_manager/WebRoot/back_noticeInfo.jsp">
	发表时间：${notice.datetime }
	<form method="post" action="${url}/notice/add!add" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-9" data-genuitec-path="/Healthy_manager/WebRoot/back_noticeInfo.jsp">
	<input type="hidden" name="notice.id" value="${notice.id}"><br/>
	标题：<input type="text" name="notice.title" value="${notice.title }"><br/>
	正文：<textarea rows="10" cols="50" name="notice.content">${notice.content }</textarea><br/>
	图片路径：${notice.imagepath }<br/>
	<input type="submit" value="修改并保存"/> 	
	</form>

	</body>
</html>
