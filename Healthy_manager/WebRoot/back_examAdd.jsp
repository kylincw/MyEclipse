<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<c:set var="url">${pageContext.request.contextPath}</c:set>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<script type="text/javascript" src="${url}/js/jquery-1.10.2.js"></script>
	</head>
	<body>

<div class="head">教师体检表添加：</div>
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
