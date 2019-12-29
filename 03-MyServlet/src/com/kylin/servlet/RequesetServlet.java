package com.kylin.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * requeset����ѧϰ��
 * 	���ã�request�����з���˵�ǰ�����������Ϣ
 * 	ʹ�ã�
 * 		��ȡ����ͷ����
 * 		��ȡ����������
 * 		��ȡ�û�����
 * 	ע�⣺
 * 		request������tomcat����������������Ϊʵ�δ��ݸ����������servlet��service����
 * @author kylin
 *
 */
public class RequesetServlet extends HttpServlet {
		
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//��ȡ����ͷ����
			//��ȡ����ʽ
			String method = req.getMethod();
			System.out.println(method);
			//��ȡ����URL
			StringBuffer url = req.getRequestURL();
			System.out.println("url:"+url);
				//��ȡURI
				String uri = req.getRequestURI();
				System.out.println("uri:"+uri);
			//��ȡЭ��
			String h = req.getScheme();
			System.out.println(h);	
		
		//��ȡ�����е�����
			//��ȡָ����������Ϣ
			String value =req.getHeader("aaa");
			System.out.println(value);
			//��ȡ���������еļ���ö��
			Enumeration e = req.getHeaderNames();
			while (e.hasMoreElements()) {
				String name = (String) e.nextElement();
				String value2 = req.getHeader(name);
				System.out.println(name+":"+value2);
			}
		
		//��ȡ�û�����(get��post���󶼿��ԣ����ܻ�ȡͬ����ֵͬ�������ݵ�ȫ��ֵ)
			String name = req.getParameter("uname");
			String pwd = req.getParameter("pwd");
			String [] favs = req.getParameterValues("fav");
			System.out.println(name+":"+pwd);
			//���⵱fav�����ڵ�ʱ������fav��ֵ��ɿ�ָ���쳣
			if (favs!=null) {
				for (String fav : favs) {
					System.out.print(fav);
				}
			}
			
	}
}
