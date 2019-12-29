package cn.itbaizhan.health.service.impl;

import java.util.List;

import cn.itbaizhan.health.dao.PageDAOInter;
import cn.itbaizhan.health.service.PageServiceInter;
import cn.itbaizhan.health.vo.Pages;

public class PageServiceImpl implements PageServiceInter {
	private PageDAOInter pageDao;

	public void setPageDao(PageDAOInter pageDao) {
		this.pageDao = pageDao;
	}

	/*---------------------*/

	public Pages findAll(Pages pages, String classType, String sortFields)
			throws Exception {
		String hql = "from " + classType + " tmp order by tmp." + sortFields
				+ " desc";
		List<?> pageList = pageDao.findByPage(hql, pages.getPageNow(), pages
				.getPageSize());
		pages.setPageList(pageList);
		long recordCount = pageDao.findRecordCount(classType);
		pages.setRecordCount(recordCount);
		pages.setPageCount();
		return pages;
	}

}
