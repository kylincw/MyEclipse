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
		<table width="100%" border="0" cellpadding="0" cellspacing="1"
			bgcolor="FEC286">
			<tr>
				<td width="4%" class="font1">
					序号
				</td>
				<td width="8%" class="font1">
					昵称
				</td>
				<td width="8%" class="font1">
					密码
				</td>
				<td width="8%" class="font1">
					真实姓名
				</td>
				<td width="4%" class="font1">
					年龄
				</td>
				<td width="4%" class="font1">
					性别
				</td>
				<td width="12%" class="font1">
					邮箱
				</td>
				<td width="12%" class="font1">
					安全问题
				</td>
				<td width="12%" class="font1">
					验证答案
				</td>
				<td width="12%" class="font1">
					电话
				</td>
				<td width="20%" class="font1">
					基本操作
				</td>
			</tr>
			<c:forEach items="${pages.pageList}" var="t" varStatus="n">
				<tr>
					<td>
						<span class="font2">${n.count}</span>
					</td>
					<td>
						<span class="font2">${t.name}</span>
					</td>
					<td>
						<span class="font2">${t.password}</span>
					</td>
					<td>
						<span class="font2">${t.realname}</span>
					</td>
					<td>
						<span class="font2">${t.age}</span>
					</td>
					<td>
						<span class="font2">${t.sex}</span>
					</td>
					<td>
						<span class="font2">${t.email}</span>
					</td>
					<td>
						<span class="font2">${t.question}</span>
					</td>
					<td>
						<span class="font2">${t.answer}</span>
					</td>
					<td>
						<span class="font2">${t.phone}</span>
					</td>
					<td>
						<span class="font2">
						<a href="${url}/back/del_teacher?id=${t.id}"><img src="${url}/images/del.gif" />删除</a>
						</span>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="11">
					<jsp:include page="./back_pages.jsp">
						<jsp:param value="/back/back_teacher" name="action" />
					</jsp:include>
				</td>
			</tr>
		</table>
	</body>
</html>
