<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<title>添加</title>

<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">
</head>

<body>
	<%
		String uuid = request.getParameter("uuid");

		try {
			Class.forName("com.mysql.jdbc.Driver");//记载数据库驱动，注册到驱动管理器
			String url = "jdbc:mysql://127.0.0.1:3306/my_test?useUnicode=true&characterEncoding=UTF-8"; //根据自己的情况修改mysql数据库ip和端口，mysql是数据库上存在的一个库
			String username = "root"; //登录账号
			String password = "kylin"; //登录密码
			Connection conn = DriverManager.getConnection(url, username, password);
			if (conn != null) {
				out.println("<a href='indexAdd.html'>添加信息</a><br/>");
				System.out.println("Connection OK.");
				//创建Statement
				Statement stm = (Statement) conn.createStatement();
				//执行查询
				ResultSet rs = stm.executeQuery("select * from test where uuid='" + uuid + "'");
				if (rs.next()) {
					String c3 = rs.getString("c3");
					System.out.println(c3);
	%>
	<form action="indexAmendH.jsp" method="post">
		<input type="hidden" name="uuid" value="<%=uuid%>" />
		<p>
			字段2: <input type="text" name="c0" value="<%=rs.getString("c0")%>" />
		</p>
		<p>
			字段3: <input type="text" name="c1" value="<%=rs.getString("c1")%>" />
		</p>
		<p>
			字段4: <select name="c3">
				<option value="男" <% if(c3.equals("男")) out.print("selected"); %>>男</option>
				<option value=" 女"  <% if(c3.equals("女")) out.print("selected"); %>>女</option>
			</select>
		</p>
		<input type="submit" value="Submit" />
	</form>
	<%
		}
				if (rs != null)
					rs.close();
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
	%>

</body>
</html>
