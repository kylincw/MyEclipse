package com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.json.JSONArray;
import org.json.JSONObject;

public class DBOperation {
	/**
	 * DB查找操作接口
	 * @param sql
	 * @return
	 */
	public String queryDB(String sql){
		JSONArray jsonArray = new JSONArray();
		
		try {
			connDB();
			if (conn != null) {
				// 创建Statement
				stm = (Statement) conn.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				// 动态列名
				ResultSetMetaData rsm =rs.getMetaData();
				int colCount = rsm.getColumnCount();
				
				while(rs.next()){
					jsonArray.put(getObject(rs, rsm, colCount));
				}
				
				releaseDB();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("total", 10);
//		jsonObject.put("rows", jsonArray);
		
		return jsonArray.toString();
//		return jsonObject.toString();
	}
	
	/**
	 * 依据表结构元数据及对应结果集生成jsonObject
	 * @param rs 结果集
	 * @param rsm 表格元数据
	 * @param colCount 列数量
	 * @return
	 */
	private JSONObject getObject(ResultSet rs, ResultSetMetaData rsm, int colCount){
		JSONObject jsonObject = new JSONObject();
		try {
			for (int i = 0; i < rsm.getColumnCount(); i++) {
				jsonObject.put(rsm.getColumnName(i + 1), rs.getString(i + 1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
	/**
	 * DB更新操作接口
	 * @param sql 要执行的SQL语句
	 * @return
	 */
	public int updateDB(String sql){
		int opCount = 0;

		try {
			connDB();
			if (conn != null) {
				// 创建Statement
				stm = (Statement) conn.createStatement();
				opCount = stm.executeUpdate(sql);
				releaseDB();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return opCount;
	}
	
	/**
	 * 连接DB
	 */
	private void connDB(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/my_test?useUnicode=true&characterEncoding=UTF-8";  //根据自己的情况修改mysql数据库ip和端口，mysql是数据库上存在的一个库
	        String username="root";   //登录账号
	        String password="kylin";  //登录密码
	        conn=DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}//记载数据库驱动，注册到驱动管理器
	}
	
	/**
	 * 释放资源
	 */
	private void releaseDB(){
		try {
			if (stm != null)
				stm.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Connection conn;
	private Statement stm;
	private String sql;
}
