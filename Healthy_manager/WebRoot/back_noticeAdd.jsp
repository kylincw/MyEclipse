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
	text-align:center;
}
</style>
	</head>
	<body>
<div class="head">健康新闻：</div>
	<form id="notice_form" method="post" enctype="multipart/form-data">
	<table border="0">
	<tr>
	<td class="lable">标题：</td>
	<td><input type="text" name="notice.title"></td>
	</tr>
	<tr>
	<td class="lable">内容：</td>
	<td><textarea rows="10" cols="50" name="notice.content"></textarea></td>
	</tr>
	<tr>
	<td class="lable">配图：</td>
	<td><input type="file" name="upload" id="upload" /></td>
	</tr>
	<tr>
	<td colspan="2"><center><input type="button" id="submit_button" value="添加"></center></td>
	</tr>
	</table>
	</form>
	</body>
	<script type="text/javascript">
	$(document).ready(function() {
			$("#submit_button").click(function() {
		var value = $("#upload").val();
		if (null != value && "" != value) {
			$("#notice_form").attr("action","${url}/back/add_notice").submit();
		} else {
			alert("请选择上传图片");
		}
	});
		
	})
	</script>
</html>
