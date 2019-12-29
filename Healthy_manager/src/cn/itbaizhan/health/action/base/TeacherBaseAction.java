package cn.itbaizhan.health.action.base;

import cn.itbaizhan.health.po.Teacher;
import cn.itbaizhan.health.service.PageServiceInter;
import cn.itbaizhan.health.service.TeacherServiceInter;
import cn.itbaizhan.health.vo.Pages;

import com.opensymphony.xwork2.ActionSupport;

public class TeacherBaseAction extends ActionSupport {
	protected TeacherServiceInter teacherService;
	protected PageServiceInter pageService;

	public void setPageService(PageServiceInter pageService) {
		this.pageService = pageService;
	}

	public void setTeacherService(TeacherServiceInter teacherService) {
		this.teacherService = teacherService;
	}

	/*-------------------------------------------------*/
	protected Teacher teacher = new Teacher();
	protected String errorMessage;
	protected Pages pages;
	protected Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pages getPages() {
		return pages;
	}

	public void setPages(Pages pages) {
		this.pages = pages;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
