package com.kylin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kylin.pojo.User;
import com.kylin.service.LoginService;
import com.kylin.service.impl.LoginServiceImpl;


/**
 * Cookie信息校验
 * 		判断请求中是否携带正确的Cookie信息
 * 		如果有则校验Cookie信息是否正确
 * 			如果校验正确则直接响应主页面给用户
 * 			如果校验不正确则响应登录页面给用户
 * 		没有则请求转发给登录页面
 * 
 * @author kylin
 *
 */
public class CookieServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求编码格式
		req.setCharacterEncoding("utf-8");
		//设置响应编码格式
		resp.setContentType("text/html;charset=utf-8");
		//获取请求信息
			//获取Cookie信息
			Cookie[] cks = req.getCookies();
		//处理请求信息
			if(cks!=null){
				//遍历Cookie信息
					String uid="";
					for(Cookie c:cks){
						if("uid".equals(c.getName())){
							//"uid"代表的是字符串值为uid
							uid=c.getValue();
						}
					}
				//校验UID是否存在
					if("".equals(uid)){
						//请求转发
						req.getRequestDispatcher("page").forward(req, resp);
						return;
					}else{
						//校验UID用户信息
							//获取业务层对象
							LoginService ls=new LoginServiceImpl();
							User u=ls.checkUidService(uid);
							if(u!=null){
								//将用户数据存储到session对象中
								req.getSession().setAttribute("user", u);
								//网页技术器自增
								int nums = (int) this.getServletContext().getAttribute("nums");
								//自增
								nums += 1;
								this.getServletContext().setAttribute("nums", nums);
								//重定向
								resp.sendRedirect("/login/main");
								return;
							}else{
								//请求转发
								req.getRequestDispatcher("page").forward(req, resp);
								return;
							}
					}
				
			}else{
				//响应处理结果
					//请求转发
					req.getRequestDispatcher("page").forward(req, resp);
					return;
			}
	}
}
