<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String url ="jdbc:mysql://localhost:3306/my_test"; //数据库连接字符串
Class.forName("com.mysql.jdbc.Driver").newInstance(); //加载驱动程序
Connection conn= DriverManager.getConnection(url,"root","kylin"); //建立连接
String sql="select * from user_info where username=? and password=?";
PreparedStatement pStmt = conn.prepareStatement(sql);
String username= "root"; 
String password="kylin";
pStmt.setString(1,username);
pStmt.setString(2,password);
ResultSet rs=pStmt.executeQuery( );
if( rs.next() ){
out.print("你已登录，欢迎"+username);
}
else{
out.print("用户名或密码错");
}
//关闭
rs.close(); pStmt.close(); conn.close(); %>

</body>
</html>
