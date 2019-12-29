<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>

 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页测试数据库连接</title>
<!--外部引入css  -->
<link rel="stylesheet" type="text/css" href="css/style.css" /> 
</head>
<body>
<%
//注册数据库驱动
Class.forName("com.mysql.jdbc.Driver");
//获取数据库连接
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_test?useUnicode=true&characterEncoding=UTF-8", "root", "kylin");

//创建statement
Statement stmt = conn.createStatement();
//执行查询
String sql = "select * from user_info";
ResultSet rs = stmt.executeQuery(sql);
//out.println("<a href='indexAdd.html'>添加用户</a><br/>");
out.println("<div id='div1'><div id='div2'><a href='indexAdd.html' >注册用户</a></div></div>");
%>

<table cellspacing="0px" border="1px" id="ta">

<tr>
<th>学号</th>
<th>姓名</th>
<th>密码</th>
<th colspan="2">操作</th>
</tr>

<%
//遍历结果集
while(rs.next())
{%>
<tr>
<!-- 输出结果集 -->
<td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><a href='indexUpdate.html'>修改信息</a> </td>
<td><a href='indexDelete.html'>删除信息</a> </td>
</tr>
<%}
%>
</table>
</body>
</html>