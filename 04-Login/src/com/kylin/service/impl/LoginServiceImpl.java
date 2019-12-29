package com.kylin.service.impl;

import com.kylin.dao.LoginDao;
import com.kylin.dao.impl.LoginDaoImpl;
import com.kylin.pojo.User;
import com.kylin.service.LoginService;

public class LoginServiceImpl implements LoginService  {
	//创建Dao层对象
	LoginDao ld= new LoginDaoImpl();
	
	//校验用户登录信息
	@Override
	public User checkLoginService(String uname, String pwd) {
		
		return ld.checkLoginDao(uname, pwd);
	}
	
	//校验Cookie信息
	@Override
	public User checkUidService(String uid) {
		// TODO Auto-generated method stub
		return ld.checkUidDa0(uid);
	}

}
