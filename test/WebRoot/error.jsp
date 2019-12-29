<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>错误</title>
   	<style type="text/css">
   		   h1{
            font-size: 100px;
            color: red;
            margin: auto;
        }
        div {
            margin: 200px auto;
            height: 200px;
            width: 200px;
        }
   	
   	</style>
  </head>
  <body>
  <div>
  <h1>发生错误<h1>
  </div>
  </body>
</html>
