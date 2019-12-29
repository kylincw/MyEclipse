package com.kylin.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * requeset对象学习：
 * 	作用：request对象中封存了当前请求的所有信息
 * 	使用：
 * 		获取请求头数据
 * 		获取请求行数据
 * 		获取用户数据
 * 	注意：
 * 		request对象由tomcat服务器创建，并作为实参传递给处理请求的servlet的service方法
 * @author kylin
 *
 */
public class RequesetServlet extends HttpServlet {
		
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取请求头数据
			//获取请求方式
			String method = req.getMethod();
			System.out.println(method);
			//获取请求URL
			StringBuffer url = req.getRequestURL();
			System.out.println("url:"+url);
				//获取URI
				String uri = req.getRequestURI();
				System.out.println("uri:"+uri);
			//获取协议
			String h = req.getScheme();
			System.out.println(h);	
		
		//获取请求行的数据
			//获取指定的请求信息
			String value =req.getHeader("aaa");
			System.out.println(value);
			//获取所有请求行的键的枚举
			Enumeration e = req.getHeaderNames();
			while (e.hasMoreElements()) {
				String name = (String) e.nextElement();
				String value2 = req.getHeader(name);
				System.out.println(name+":"+value2);
			}
		
		//获取用户数据(get和post请求都可以，不能获取同键不同值多项数据的全部值)
			String name = req.getParameter("uname");
			String pwd = req.getParameter("pwd");
			String [] favs = req.getParameterValues("fav");
			System.out.println(name+":"+pwd);
			//避免当fav不存在的时候，请求fav的值造成空指针异常
			if (favs!=null) {
				for (String fav : favs) {
					System.out.print(fav);
				}
			}
			
	}
}
