<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

<%
	try{
        Class.forName("com.mysql.jdbc.Driver");//记载数据库驱动，注册到驱动管理器
        String url="jdbc:mysql://127.0.0.1:3306/my_test?useUnicode=true&characterEncoding=UTF-8";  //根据自己的情况修改mysql数据库ip和端口，mysql是数据库上存在的一个库
        String username="root";   //登录账号
        String password="kylin";  //登录密码
        Connection conn=DriverManager.getConnection(url,username,password);
        if(conn!=null){
            out.println("<a href='indexAdd.html'>添加信息</a><br/>");
            System.out.println("Connection OK.");
            //创建Statement
			Statement stm = (Statement) conn.createStatement();
			//执行查询
			ResultSet rs = stm.executeQuery("select * from test");
			
			out.println("<table width='100%' class='gridtable'>");
			out.println("<tr>");
            //out.println("<th>字段1</th>");
            out.println("<th>字段2</th>");
            out.println("<th>字段3</th>");
            out.println("<th>字段4</th>");
            out.println("<th>操作</th>");
           	out.println("</tr>");
           	
			while (rs.next()) {
				String uuid = rs.getString(1);
				out.println("<tr>");
				//out.println("<td>"+uuid+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("<td>"+rs.getString(4)+"</td>");
				out.println("<td><a href='indexAmend.jsp?uuid="+uuid+"'>修改</a> | <a href='indexDelete.jsp?uuid="+uuid+"'>删除</a></td>");
				out.println("</tr>");
			}
			out.println("</table>");
			//release resource
			if (rs != null)
				rs.close();
			if (stm != null)
				stm.close();
			if (conn != null)
				conn.close();
		} else {
			out.println("数据库连接失败！！！");
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
%>
</body>
</html>