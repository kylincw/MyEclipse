package com.kylin.service.impl;



import java.util.List;

import org.apache.log4j.Logger;

import com.kylin.dao.UserDao;
import com.kylin.dao.impl.UserDaoImpl;
import com.kylin.pojo.User;
import com.kylin.service.UserService;

public class UserServiceImpl implements UserService{
	//声明日志对象
	Logger logger =	Logger.getLogger(UserServiceImpl.class);
	//声明Dao层对象
	UserDao ud = new UserDaoImpl();
	
	//用户登录
	@Override
	public User checkUserLoginService(String uname, String pwd) {
		//打印日志
		logger.debug(uname+"发起登录请求");
		User u = ud.checkUserLoginDao(uname, pwd);
		if (u!=null) {
			logger.debug(uname+"登录成功");
		} else{
			logger.debug(uname+"登录失败");
		}
		 return u;
	}

	@Override
	public int userChangePwdService(String newPwd, int uid) {
		//打印日志
		logger.debug(uid+"发起修改密码请求");
		int index = ud.userChangPwdDao(newPwd, uid);
		if (index>0) {
			logger.debug(uid+"修改密码请求成功");
		}else{
			logger.debug(uid+"修改密码请求失败");
		}
		return index;
	}

	@Override
	public List<User> userShowService() {
		//打印日志
		List<User> lu = ud.userShowDao();
		logger.debug("显示所有用户信息"+lu);
		return lu;
	}

	@Override
	public int userRegService(User u) {
		
		return ud.userRegDao(u);
	}


}
