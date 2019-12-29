package com.kylin.dao;

import com.kylin.pojo.User;

public interface LoginDao {
	//根据用户名和密码获取用户信息
	User checkLoginDao(String uname,String pwd);

	//根据uid获取用户信息
	User checkUidDa0(String uid);
}
