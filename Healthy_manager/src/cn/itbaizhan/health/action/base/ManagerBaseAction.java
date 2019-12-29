package cn.itbaizhan.health.action.base;

import cn.itbaizhan.health.po.Manager;
import cn.itbaizhan.health.service.ManagerServiceInter;
import cn.itbaizhan.health.service.PageServiceInter;
import cn.itbaizhan.health.vo.Pages;

import com.opensymphony.xwork2.ActionSupport;

public class ManagerBaseAction extends ActionSupport {
	protected ManagerServiceInter managerService;
	protected PageServiceInter pageService;

	public void setPageService(PageServiceInter pageService) {
		this.pageService = pageService;
	}

	public void setManagerService(ManagerServiceInter managerService) {
		this.managerService = managerService;
	}

	/*-------------------------------------------------*/
	protected Manager manager;
	protected Pages pages;
	protected String errorMessage;
	protected Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Pages getPages() {
		return pages;
	}

	public void setPages(Pages pages) {
		this.pages = pages;
	}

}
