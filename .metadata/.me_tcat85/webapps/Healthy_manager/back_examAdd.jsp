<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<c:set var="url">${pageContext.request.contextPath}</c:set>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<script type="text/javascript" src="${url}/js/jquery-1.10.2.js"></script>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"5635",secure:"5644"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-1" data-genuitec-path="/Healthy_manager/WebRoot/back_examAdd.jsp">

<div class="head" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-1" data-genuitec-path="/Healthy_manager/WebRoot/back_examAdd.jsp">教师体检表添加：</div>
	<form id="examform" method="post" enctype="multipart/form-data">
	选择您所入库的体检表：<input type="file" name="filePath"  />
	<input type="button" id="exam_button" value="体检表入库">
	</form>
	</body>
	<script type="text/javascript">
	$(document).ready(function() {
			$("#exam_button").click(function() {
					$("#examform").attr("action","${url}/back/save_exam").submit();
			});
	})
	</script>
</html>
