<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"5635",secure:"5644"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-7" data-genuitec-path="/Healthy_manager/WebRoot/back_notice.jsp">
	<div style="float: right;" class="font1" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-7" data-genuitec-path="/Healthy_manager/WebRoot/back_notice.jsp">
	<a href="${url}/back_noticeAdd.jsp">添加健康新闻</a>
	</div>
	<div style="padding-top: 20px;">
		<table width="100%" border="0" cellpadding="0" cellspacing="1"
			bgcolor="FEC286">
			<tr>
				<td width="4%" class="font1">
					序号
				</td>
				<td width="6%" class="font1">
					发表时间
				</td>
				<td width="8%" class="font1">
					标题
				</td>
				<td width="5%" class="font1">
					作者
				</td>
				<td width="45%" class="font1">
					正文
				</td>
				<td width="8%" class="font1">
					配图路径
				</td>
				<td width="18%" class="font1">
					操作
				</td>
			</tr>
			<c:forEach items="${pages.pageList}" var="u" varStatus="n">
				<tr>
					<td>
						<span class="font2">${n.count}</span>
					</td>
					<td>
						<span class="font2"><fmt:formatDate value="${u.datetime}" pattern="yyyy-MM-dd HH:mm" /></span>
					</td>
					<td>
						<span class="font2">${u.title}</span>
					</td>
					<td>
						<span class="font2">${u.manager.name}</span>
					</td>
					<td>
						<span class="font2">${u.content}</span>
					</td>
					<td>
						<span class="font2">${u.imagepath}</span>
					</td>
					<td>
						<span class="font2">
						<a href="${url}/back/find_notice?id=${u.id}"><img src="${url}/images/edt.gif" />编辑</a>
						&nbsp;&nbsp;
						<a href="${url}/back/del_notice?id=${u.id}"><img src="${url}/images/del.gif" />删除</a>
						</span>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="7">
					<jsp:include page="./back_pages.jsp">
						<jsp:param value="/back/back_notice" name="action" />
					</jsp:include>
				</td>
			</tr>
		</table>
		</div>
	</body>
</html>
