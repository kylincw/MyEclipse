package com.kylin.dao;

import com.kylin.pojo.User;

public interface LoginDao {
	//�����û����������ȡ�û���Ϣ
	User checkLoginDao(String uname,String pwd);

	//����uid��ȡ�û���Ϣ
	User checkUidDa0(String uid);
}
