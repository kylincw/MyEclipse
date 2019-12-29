package cn.itbaizhan.health.service.impl;

import cn.itbaizhan.health.dao.ManagerDAOInter;
import cn.itbaizhan.health.po.Manager;
import cn.itbaizhan.health.service.ManagerServiceInter;

public class ManagerServiceImpl implements ManagerServiceInter {
	private ManagerDAOInter managerDao;

	public void setManagerDao(ManagerDAOInter managerDao) {
		this.managerDao = managerDao;
	}

	/*---------------------------------------------------------*/
	public Manager find(Manager manager) throws Exception {
		Manager m = managerDao.find(manager);
		return m;
	}
	
	public boolean delete(Integer id) throws Exception {
		return managerDao.delete(id);
	}

	public boolean add(Manager manager) throws Exception {
		return managerDao.add(manager);
	}

}
