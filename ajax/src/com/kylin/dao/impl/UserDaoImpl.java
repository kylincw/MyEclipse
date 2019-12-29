package com.kylin.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kylin.dao.UserDao;
import com.kylin.pojo.User;

public class UserDaoImpl implements UserDao{

	@Override
	public User getUserInfo(String name) {
		//声明jdbc变量
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//声明变量
		User u = null;
		try {
			//加载驱动
			Class.forName("oracle.jdbc.OracleDriver");
			//获取连接对象
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
			//创建sql命令
			String sql = "select * from users where uname =? ";
			//创建sql命令对象
			ps = conn.prepareStatement(sql);
			//给占位符赋值
			ps.setString(1, name);
			//遍历查询
			rs = ps.executeQuery();
			if (rs.next()) {
				u = new User();
				u.setUid(rs.getInt("unum"));
				u.setUname(rs.getString("uname"));
				u.setPrice(rs.getDouble("price"));
				u.setLoc(rs.getString("loc"));
				u.setDesc(rs.getString("des"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//返回
		return u;
	}

}
