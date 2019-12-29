package cn.itbaizhan.health.action;

import java.util.Map;

import cn.itbaizhan.health.action.base.ManagerBaseAction;
import cn.itbaizhan.health.po.Manager;
import cn.itbaizhan.health.vo.Pages;

import com.opensymphony.xwork2.ActionContext;

public class ManagerAction extends ManagerBaseAction {
	public String login() {
		try {
			if ("".equals(manager.getName()) || null == manager.getName()
					|| "".equals(manager.getPassword())
					|| null == manager.getPassword()) {
				errorMessage = "请输入完整信息登录！";
				return "error";
			}
			Manager m = managerService.find(manager);
			if (null != m) {
				ActionContext actionContext = ActionContext.getContext();
				Map<String, Object> session = actionContext.getSession();
				session.put("manager", m);
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		errorMessage = "登录失败，请正确输入密码重新登录！";
		return "error";
	}

	public String logout() {
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		if (null != session.get("manager")) {
			session.remove("manager");
			return SUCCESS;
		}
		errorMessage = "注销失败！";
		return "error";
	}

	public String managerBackFindAll() {
		try {
			if (pages == null) {
				pages = new Pages();
			}
			if (pages.getPageSize() == null) {
				pages.setPageSize(10);
			}
			pages = pageService.findAll(pages, "Manager", "id");
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	public String managerDelete(){
		try {
			boolean flag=managerService.delete(id);
			if(flag){
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		errorMessage="管理员删除失败！";
		return "error";
	}
	
	public String managerAdd(){
		try {
			managerService.add(manager);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		errorMessage="管理员添加失败！";
		return "error";
	}
}
