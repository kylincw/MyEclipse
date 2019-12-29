<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
  <c:set var="url">${pageContext.request.contextPath}<%=request.getParameter("action") %></c:set>
		
	<c:if test="${pages.pageCurrent<=pages.pageDetail}">
	<c:set value="1" var="m"></c:set>
	</c:if>
	<c:if test="${pages.pageCurrent>pages.pageDetail}">
	<c:set value="${pages.pageCurrent-pages.pageDetail}" var="m"></c:set>
	</c:if>
	<c:if test="${(pages.pageCount-pages.pageCurrent)<pages.pageDetail}">
	<c:set value="${pages.pageCount}" var="n"></c:set>
	</c:if>
	<c:if test="${(pages.pageCount-pages.pageCurrent)>=pages.pageDetail}">
	<c:set value="${pages.pageCurrent+pages.pageDetail}" var="n"></c:set>
	</c:if>
	
	<c:if test="${pages.pageCurrent>1}">
	<a href="${url}?pages.pageCurrent=1&pages.pageSize=${pages.pageSize}">首页</a>
	<a href="${url}?pages.pageCurrent=${pages.pageCurrent-1}&pages.pageSize=${pages.pageSize}">上一页</a>
	</c:if>
	<c:forEach var="num" begin="${m}" end="${pages.pageCurrent-1}" step="1">
	<a href="${url}?pages.pageCurrent=${num}&pages.pageSize=${pages.pageSize}">${num}</a>
	</c:forEach>
	${pages.pageCurrent}
	<c:forEach var="num" begin="${pages.pageCurrent+1}" end="${n}" step="1">
	<a href="${url}?pages.pageCurrent=${num}&pages.pageSize=${pages.pageSize}">${num}</a>
	</c:forEach>
	<c:if test="${pages.pageCurrent<pages.pageCount}">
	<a href="${url}?pages.pageCurrent=${pages.pageCurrent+1}&pages.pageSize=${pages.pageSize}">下一页</a>
	<a href="${url}?pages.pageCurrent=${pages.pageCount}&pages.pageSize=${pages.pageSize}">末页</a>
	</c:if>
		
	<form method="post" action="${url}">
	<input type="hidden" name="pages.pageSize" value="${pages.pageSize}">
		转到
		<input type="text" id="text" name="pages.pageCurrent"  style="width:20px;"/>
		页
		<input type="submit" value="跳" style="cursor: pointer;">
	</form>
	
	共${pages.recordCount}条记录，共分${pages.pageCount}页
	<form method="post" action="${url}">
		每页显示
		<input type="text" id="size" value="${pages.pageSize}" name="pages.pageSize"  style="width:30px;"/>
		条记录
		<input type="submit" value="确定" style="cursor: pointer;">
	</form>
  </body>
</html>
