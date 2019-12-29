package cn.itbaizhan.health.service.impl;

import cn.itbaizhan.health.dao.DairyDAOInter;
import cn.itbaizhan.health.po.Dairy;
import cn.itbaizhan.health.po.Teacher;
import cn.itbaizhan.health.service.DairyServiceInter;

public class DairyServiceImpl implements DairyServiceInter {
	private DairyDAOInter dairyDao;

	public void setDairyDao(DairyDAOInter dairyDao) {
		this.dairyDao = dairyDao;
	}

	public boolean add(Dairy dairy) throws Exception {
		return dairyDao.add(dairy);
	}

	public Dairy find(Teacher teacher, String day) throws Exception {
		return  dairyDao.find(teacher,day);
	}
}
