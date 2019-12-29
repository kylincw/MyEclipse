package com.kylin.service.impl;

import com.kylin.dao.LoginDao;
import com.kylin.dao.impl.LoginDaoImpl;
import com.kylin.pojo.User;
import com.kylin.service.LoginService;

public class LoginServiceImpl implements LoginService  {
	//����Dao�����
	LoginDao ld= new LoginDaoImpl();
	
	//У���û���¼��Ϣ
	@Override
	public User checkLoginService(String uname, String pwd) {
		
		return ld.checkLoginDao(uname, pwd);
	}
	
	//У��Cookie��Ϣ
	@Override
	public User checkUidService(String uid) {
		// TODO Auto-generated method stub
		return ld.checkUidDa0(uid);
	}

}
