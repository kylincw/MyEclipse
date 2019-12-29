package com.kylin.service.impl;

import com.kylin.dao.UserDao;
import com.kylin.dao.impl.UserDaoImpl;
import com.kylin.pojo.User;
import com.kylin.service.UserService;

public class UserServiceImpl implements UserService{

	//获取Dao层对象
	UserDao ud = new UserDaoImpl();
	
	@Override
	public User getUserInfoService(String name) {
		// TODO Auto-generated method stub
		return ud.getUserInfo(name);
	}

}
