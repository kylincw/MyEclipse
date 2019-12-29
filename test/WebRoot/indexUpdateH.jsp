<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.UUID"%>
<%
String i = request.getParameter("id");
//解决乱码问题-先将其转换成字节数组，再将字节数组重新解码成字符串。
String str=request.getParameter("user");

byte[] bytes=str.getBytes("ISO-8859-1");

String user=new String(bytes,"utf-8");


String pwd = request.getParameter("pwd");
int id =  Integer.parseInt(i);

int opCount = 0;

try{
        Class.forName("com.mysql.jdbc.Driver");//记载数据库驱动，注册到驱动管理器
        String url="jdbc:mysql://127.0.0.1:3306/my_test?useUnicode=true&characterEncoding=UTF-8";  //根据自己的情况修改mysql数据库ip和端口，mysql是数据库上存在的一个库
        String username="root";   //登录账号
        String password="kylin";  //登录密码
        Connection conn=DriverManager.getConnection(url,username,password);
        System.out.println(conn+"连接成功");
        System.out.println(id);
        if(conn!=null){
            //编写sql语句
            String sql = "update user_info set username=?,password=? where id=?";
            //创建sql命令对象
            PreparedStatement ps = conn.prepareStatement(sql);
            //占位符赋值
            ps.setString(1, user);
            ps.setString(2, pwd);
            ps.setInt(3, id);
            System.out.println("占位成功！");
            //执行sql语句
           	opCount = ps.executeUpdate();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} else {
			System.out.println("数据库连接失败！！！");
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	if(opCount > 0) 
	{	
		response.sendRedirect("MyJsp.jsp");
	}
	else{
		response.sendRedirect("error.jsp");
	  }
%>