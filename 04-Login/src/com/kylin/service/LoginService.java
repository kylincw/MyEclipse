package com.kylin.service;

import com.kylin.pojo.User;

public interface LoginService {
	//校验用户登录信息
	User checkLoginService(String uname,String pwd);

	//校验用户Cookie信息在信息
	User checkUidService(String uid);
}
