package cn.itbaizhan.health.service;

import cn.itbaizhan.health.vo.Pages;

public interface PageServiceInter {

	public Pages findAll(Pages pages, String classType, String sortFields)
			throws Exception;

}
