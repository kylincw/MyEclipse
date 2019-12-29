package cn.itbaizhan.health.action;

import java.util.Map;

import cn.itbaizhan.health.action.base.TeacherBaseAction;
import cn.itbaizhan.health.po.Teacher;
import cn.itbaizhan.health.vo.Pages;

import com.opensymphony.xwork2.ActionContext;

public class TeacherAction extends TeacherBaseAction {
	public String login() {
		try {
			if ("".equals(teacher.getName()) || null == teacher.getName()
					|| "".equals(teacher.getPassword())
					|| null == teacher.getPassword()) {
				errorMessage = "请输入完整信息登录！";
				return "error";
			}
			Teacher teacher0 = teacherService.find(teacher);
			if (null != teacher0) {
				ActionContext actionContext = ActionContext.getContext();
				Map<String, Object> session = actionContext.getSession();
				session.put("teacher", teacher0);
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		errorMessage = "登录失败，请先注册或验证密码重新登录！";
		return "error";
	}

	public String logout() {
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		if (null != session.get("teacher")) {
			session.remove("teacher");
			return SUCCESS;
		}
		errorMessage = "注销失败！";
		return "error";
	}
	public String add() {
		try {
			Teacher t=teacherService.add(teacher);
			ActionContext actionContext = ActionContext.getContext();
			Map<String, Object> session = actionContext.getSession();
			session.put("teacher", t);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	public String teacherBackFindAll() {
		try {
			if (pages == null) {
				pages = new Pages();
			}
			if (pages.getPageSize() == null) {
				pages.setPageSize(10);
			}
			pages = pageService.findAll(pages, "Teacher", "id");
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	public String teacherDelete(){
		try {
			boolean flag=teacherService.delete(id);
			if(flag){
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		errorMessage="教师删除失败！";
		return "error";
	}
	
}
