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
	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-0" data-genuitec-path="/Healthy_manager/WebRoot/back_exam.jsp">
	<div style="float: right;" class="font1" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-0" data-genuitec-path="/Healthy_manager/WebRoot/back_exam.jsp">
	<a href="${url}/back_examAdd.jsp">添加教师体检信息</a>
	</div>
	<div style="padding-top: 20px;">
		<table width="100%" border="0" cellpadding="0" cellspacing="1"
			bgcolor="FEC286">
			<tr>
				<td width="4%" class="font1">
					序号
				</td>
				<td width="10%" class="font1">
					体检时间
				</td>
				<td width="8%" class="font1">
					体检教师
				</td>
				<td width="4%" class="font1">
					舒张压
				</td>
				<td width="4%" class="font1">
					收缩压
				</td>
				<td width="4%" class="font1">
					体重指数
				</td>
				<td width="4%" class="font1">
					腰臀比
				</td>
				<td width="4%" class="font1">
					尿素
				</td>
				<td width="4%" class="font1">
					尿酸
				</td>
				<td width="4%" class="font1">
					肌酐
				</td>
				<td width="4%" class="font1">
					甘油三酯
				</td>
				<td width="4%" class="font1">
					胆固醇
				</td>
				<td width="4%" class="font1">
					高密度脂蛋白胆固醇
				</td>
				<td width="4%" class="font1">
					低密度脂蛋白胆固醇
				</td>
				<td width="4%" class="font1">
					葡萄糖
				</td>
				<td width="4%" class="font1">
					同型半膀胱氨酸
				</td>
				<td width="4%" class="font1">
					微量白蛋白
				</td>
				<td width="4%" class="font1">
					微量白蛋白/尿肌酐
				</td>
				<td width="20%" class="font1">
					操作
				</td>
			</tr>
			<c:forEach items="${pages.pageList}" var="e" varStatus="n">
				<tr>
					<td>
						<span class="font2">${n.count}</span>
					</td>
					<td>
						<span class="font2"><fmt:formatDate value="${e.datetime}" pattern="yyyy-MM-dd" /></span>
					</td>
					<td>
						<span class="font2">${e.teacher.realname}</span>
					</td>
					<td>
						<span class="font2">${e.sbp}</span>
					</td>
					<td>
						<span class="font2">${e.dbp}</span>
					</td>
					<td>
						<span class="font2">${e.bmi}</span>
					</td>
					<td>
						<span class="font2">${e.whr}</span>
					</td>
					<td>
						<span class="font2">${e.bun}</span>
					</td>
					<td>
						<span class="font2">${e.ua}</span>
					</td>
					<td>
						<span class="font2">${e.crea}</span>
					</td>
					<td>
						<span class="font2">${e.tg}</span>
					</td>
					<td>
						<span class="font2">${e.chol}</span>
					</td>
					<td>
						<span class="font2">${e.hdl}</span>
					</td>
					<td>
						<span class="font2">${e.ldl}</span>
					</td>
					<td>
						<span class="font2">${e.glu}</span>
					</td>
					<td>
						<span class="font2">${e.hcy}</span>
					</td>
					<td>
						<span class="font2">${e.m_alb}</span>
					</td>
					<td>
						<span class="font2">${e.m_alb_crea}</span>
					</td>
					<td>
						<span class="font2">
						<a href="${url}/back/del_exam?id=${e.id}"><img src="${url}/images/del.gif" />删除</a>
						</span>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="19">
					<jsp:include page="./back_pages.jsp">
						<jsp:param value="/back/back_exam" name="action" />
					</jsp:include>
				</td>
			</tr>
		</table>
		</div>
	</body>
</html>
