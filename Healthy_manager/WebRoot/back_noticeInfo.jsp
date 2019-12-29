<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<c:set var="url">${pageContext.request.contextPath}</c:set>
	</head>
	<body>
	发表时间：${notice.datetime }
	<form method="post" action="${url}/notice/add!add">
	<input type="hidden" name="notice.id" value="${notice.id}"><br/>
	标题：<input type="text" name="notice.title" value="${notice.title }"><br/>
	正文：<textarea rows="10" cols="50" name="notice.content">${notice.content }</textarea><br/>
	图片路径：${notice.imagepath }<br/>
	<input type="submit" value="修改并保存"/> 	
	</form>

	</body>
</html>
