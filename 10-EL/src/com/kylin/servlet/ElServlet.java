package com.kylin.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kylin.pojo.Address;
import com.kylin.pojo.User;

/**
 * ���⣺
 * 	��servlet�����������ʹ�������������Ϊ������ת�����壬��������ת����Ӧ��jsp�ļ���
 * 	��ô��jsp�л�ȡ�������е������أ�
 * ʹ�ã�
 * 	��ͳ��ʽ����jspҳ����ʹ��java�ű������
 * 
 * @author kylin
 *
 */
public class ElServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//������������ʽ
		req.setCharacterEncoding("utf-8");
		//������Ӧ�����ʽ
		resp.setContentType("text/html;charset=utf-8");
		//��ȡ������Ϣ
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		//����������Ϣ
		System.out.println(uname+":"+pwd);
		//��Ӧ������
			//ʹ��request���������������ת
				//��ͨ�ַ���
				req.setAttribute("str","�������������ˬ���ʺ�ѧϰ");
				//��������
				User u=new User(1, "����","�ĵ�Ӱ",new Address("����","����", "�ݳ���"));
				req.setAttribute("user", u);
				//��������
					//List����
						//�洢��ͨ�ַ�
						List<String> list=new ArrayList<String>();
						list.add("�żһ�");
						list.add("����ͮ");
						list.add("��ʫʫ");
						//�洢����
						User u2=new User(2, "��������","�ĵ�Ӱ",new Address("�½�","��³ľ��","��³ľ��"));
						List<User> list2=new ArrayList<User>();
						list2.add(u2);
						req.setAttribute("list",list);
						req.setAttribute("list2",list2);
					//Map����
						//�洢��ͨ�ַ�
						Map<String,String> map=new HashMap<String,String>();
						map.put("a", "����");
						map.put("b", "�Ϻ�");
						map.put("c", "����");
						req.setAttribute("map",map);
						//�洢����
						Map<String,User> map2=new HashMap<String,User>();
						map2.put("a1", new User(3, "�����Ȱ�","�ĵ�Ӱ",new Address("�½�","��³��","��³��")));
						req.setAttribute("map2",map2);
					//��ֵ�ж�
						req.setAttribute("s","");
						req.setAttribute("s1",new User());
						req.setAttribute("s2",new ArrayList());
						req.setAttribute("s3",new HashMap());
						
						
						
			//����ת��
			req.getRequestDispatcher("/el.jsp").forward(req, resp);	
			return;
	}
}