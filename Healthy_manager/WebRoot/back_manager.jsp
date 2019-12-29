<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<c:set var="url">${pageContext.request.contextPath}</c:set>
		<link href="${url}/style/iframe.css" rel="stylesheet" type="text/css" />
		<style>
a {
	text-decoration: none;
	cursor: pointer;
}

a:hover {
	color: #ff5400;
	text-decoration: underline;
}
</style>
	</head>
	<body>
	<div style="float: right;" class="font1">
	<a href="${url}/back_managerAdd.jsp">添加管理员</a>
	</div>
	<div style="padding-top: 20px;">
		<table width="100%" border="0" cellpadding="0" cellspacing="1"
			bgcolor="FEC286">
			<tr>
				<td width="4%" class="font1">
					序号
				</td>
				<td width="25%" class="font1">
					管理员
				</td>
				<td width="25%" class="font1">
					密码
				</td>
				<td width="20%" class="font1">
					操作
				</td>
			</tr>
			<c:forEach items="${pages.pageList}" var="m" varStatus="n">
				<tr>
					<td>
						<span class="font2">${n.count}</span>
					</td>
					<td>
						<span class="font2">${m.name}</span>
					</td>
					<td>
						<span class="font2">${m.password}</span>
					</td>
					<td>
						<span class="font2">
						<a href="${url}/back/del_manager?id=${m.id}"><img src="${url}/images/del.gif" />删除</a>
						</span>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="4">
					<jsp:include page="./back_pages.jsp">
						<jsp:param value="/back/back_manager" name="action" />
					</jsp:include>
				</td>
			</tr>
		</table>
		</div>
	</body>
</html>
