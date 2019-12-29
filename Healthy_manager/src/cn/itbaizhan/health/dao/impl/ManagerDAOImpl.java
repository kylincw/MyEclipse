package cn.itbaizhan.health.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itbaizhan.health.dao.ManagerDAOInter;
import cn.itbaizhan.health.po.Manager;

public class ManagerDAOImpl extends HibernateDaoSupport implements
		ManagerDAOInter {

	public Manager find(Manager manager) throws Exception {
		String hql = "from Manager m where m.name=? and m.password=?";
		String[] str = new String[] { manager.getName(), manager.getPassword() };
		List<Manager> list = this.getHibernateTemplate().find(hql, str);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public boolean delete(Integer id) throws Exception {
		boolean flag = false;
		Manager m = this.getHibernateTemplate().load(Manager.class, id);
		this.getHibernateTemplate().delete(m);
		flag = true;
		return flag;
	}

	public boolean add(Manager manager) throws Exception {
		boolean flag = false;
		this.getHibernateTemplate().save(manager);
		flag = true;
		return flag;
	}
}
