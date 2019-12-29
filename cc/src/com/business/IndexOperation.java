package com.business;

import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

import com.common.DBOperation;

public class IndexOperation {
	
	/**
	 * 构造方法，进行初始化操作
	 */
	public IndexOperation(){
		dbOp = new DBOperation();
	}
	
	/**
	 * 统一入口控制
	 * @return
	 */
	public String getData(){
		if(flags.equals("add"))
			return add();
		else if(flags.equals("amend"))
			return amend();
		else if(flags.equals("delete"))
			return delete();
		else if(flags.equals("query"))
			return query();
		return "";
	}
	
	/**
	 * 查询所有数据
	 * @return
	 */
	public String query(){
		sql = "select * from test";
		String returnStr = dbOp.queryDB(sql);
		System.out.println(returnStr);
		return returnStr;
	}

	/**
	 * 添加信息
	 * @return
	 */
	private String add(){
		uuid = UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
		sql = "insert into test values('" + uuid + "','" + c0 + "','" + c1 + "','" + c3 + "')";
		
		int opCount = dbOp.updateDB(sql);
		JSONObject jsonObject = new JSONObject();
		if (opCount > 0){
			jsonObject.put("errorMsg", "");
			jsonObject.put("success", true);
		} else {
			jsonObject.put("errorMsg", "添加失败");
			jsonObject.put("success", false);
		}
		return jsonObject.toString();
	}
	
	/**
	 * 删除信息
	 * @return
	 */
	private String delete(){
		sql = "delete from test where uuid='" + uuid + "'";
		
		int opCount = dbOp.updateDB(sql); 
		JSONObject jsonObject = new JSONObject();
		if (opCount > 0){
			jsonObject.put("errorMsg", "");
			jsonObject.put("success", true);
		} else {
			jsonObject.put("errorMsg", "删除失败");
			jsonObject.put("success", false);
		}
		return jsonObject.toString();
	}
	
	/**
	 * 修改信息
	 * @return
	 */
	private String amend(){
//		sql = "update test set c0='" + c0 + "',c1='" + c1 + "',c3='" + c3 + "' where uuid='" + uuid + "'";
		sql = "update test set c0='"+c0+"',"+"c1='"+c1+"',"+"c3='"+c3+"'"+"where uuid='"+uuid+"'";
																			
		int opCount = dbOp.updateDB(sql);
		JSONObject jsonObject = new JSONObject();
		if (opCount > 0){
			jsonObject.put("errorMsg", "");
			jsonObject.put("success", true);
		} else {
			jsonObject.put("errorMsg", "修改失败");
			jsonObject.put("success", false);
		}
		return jsonObject.toString();
	}
	
	private String sql;
	private DBOperation dbOp;
	/**
	 * setter/getter
	 */
	private String c1;
	private String c0;
	private String c3;
	private String uuid;
	
	private String flags;

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getC0() {
		return c0;
	}

	public void setC0(String c0) {
		this.c0 = c0;
	}

	public String getC3() {
		return c3;
	}

	public void setC3(String c3) {
		this.c3 = c3;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getFlags() {
		return flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}
	
}
