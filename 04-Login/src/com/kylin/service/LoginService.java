package com.kylin.service;

import com.kylin.pojo.User;

public interface LoginService {
	//У���û���¼��Ϣ
	User checkLoginService(String uname,String pwd);

	//У���û�Cookie��Ϣ����Ϣ
	User checkUidService(String uid);
}
