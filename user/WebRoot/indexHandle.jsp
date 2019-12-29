<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dataHandle" class="com.business.IndexOperation"></jsp:useBean>
<jsp:setProperty property="*" name="dataHandle"/>
<%
	out.println(dataHandle.getData());
// 	if(dataHandle.getData().equals("OK")) response.sendRedirect("index.jsp");
// 	else  response.sendRedirect("error.jsp");
%>