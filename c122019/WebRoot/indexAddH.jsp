<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.UUID"%>
<%
	String c1 = request.getParameter("c1");
String c0 = request.getParameter("c0");
String c3 = request.getParameter("c3");
String uuid = UUID.randomUUID().toString().replaceAll("-","");

int opCount = 0;

try{
        Class.forName("com.mysql.jdbc.Driver");//记载数据库驱动，注册到驱动管理器
        String url="jdbc:mysql://127.0.0.1:3306/my_test?useUnicode=true&characterEncoding=UTF-8";  //根据自己的情况修改mysql数据库ip和端口，mysql是数据库上存在的一个库
        String username="root";   //登录账号
        String password="kylin";  //登录密码
        Connection conn=DriverManager.getConnection(url,username,password);
        if(conn!=null){
            //创建Statement
			Statement stm = (Statement) conn.createStatement();
			String sql = "insert into test values('" + uuid + "','" + c0 + "','" + c1 + "','" + c3 + "')";
			opCount= stm.executeUpdate(sql);
			if (stm != null)
				stm.close();
			if (conn != null)
				conn.close();
		} else {
			System.out.println("数据库连接失败！！！");
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	if(opCount > 0) response.sendRedirect("index.jsp");
	else  response.sendRedirect("error.jsp");
%>