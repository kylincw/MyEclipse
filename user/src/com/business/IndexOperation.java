package com.business;

import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

import com.common.DBOperation;


/**
 * 
 * @author kylin
 *
 */
public class IndexOperation {
	
	private String sql;
	private DBOperation dbOp;
	/**
	 * set和get方法
	 */
	private String uuid;
	private String uname;
	private String pwd;
	private String email;
	private String phone;
	private String flags;
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFlags() {
		return flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}
	
	
	
	public IndexOperation(){
		dbOp = new DBOperation();
	}
	
	/**
	 * 处理请求
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
	

	
	public String query(){
		sql = "select * from user";
		String returnStr = dbOp.queryDB(sql);
		System.out.println(returnStr);
		return returnStr;
	}

	/**
	 * 添加用户数据
	 * @return
	 */
	private String add(){
		uuid = UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
		sql = "insert into user values('" + uuid +"','"  + uname + "','" + pwd + "','" + email+"','"+phone+"')";
		int opCount = dbOp.updateDB(sql);
		JSONObject jsonObject = new JSONObject();
		if (opCount > 0){
			jsonObject.put("errorMsg", "");
			jsonObject.put("success", true);
		} else {
			jsonObject.put("errorMsg", "添加失败！");
			jsonObject.put("success", false);
		}
		return jsonObject.toString();
	}
	
	/**
	 * 删除用户数据
	 * @return
	 */
	private String delete(){
		sql = "delete from user where uuid='" + uuid + "'";
		int opCount = dbOp.updateDB(sql); 
		JSONObject jsonObject = new JSONObject();
		if (opCount > 0){
			jsonObject.put("errorMsg", "");
			jsonObject.put("success", true);
		} else {
			jsonObject.put("errorMsg", "删除失败！");
			jsonObject.put("success", false);
		}
		return jsonObject.toString();
	}
	
	/**
	 * 修改用户数据
	 * @return
	 */
	private String amend(){
		System.out.println(uname+":"+pwd+":"+email+":"+phone+":"+uuid);
		sql = "update user set uname ="+"'"+uname+"',"+"pwd="+"'"+pwd+"',"+"email="+"'"+email+"',"+"phone="+"'"+phone+"'"+"where uuid="+"'"+uuid+"'";
		int opCount = dbOp.updateDB(sql);
		JSONObject jsonObject = new JSONObject();
		if (opCount > 0){
			jsonObject.put("errorMsg", "");
			jsonObject.put("success", true);
		} else {
			jsonObject.put("errorMsg", "修改成功");
			jsonObject.put("success", false);
		}
		return jsonObject.toString();
	}
	
	

}
