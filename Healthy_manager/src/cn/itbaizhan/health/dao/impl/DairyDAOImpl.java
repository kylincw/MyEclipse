package cn.itbaizhan.health.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itbaizhan.health.dao.DairyDAOInter;
import cn.itbaizhan.health.po.Dairy;
import cn.itbaizhan.health.po.Teacher;

public class DairyDAOImpl extends HibernateDaoSupport implements DairyDAOInter {

	public boolean add(Dairy dairy) throws Exception {
		this.getHibernateTemplate().saveOrUpdate(dairy);
		return true;
	}

	public Dairy find(Teacher teacher,String day) throws Exception {
		String hql = "from Dairy d where d.teacher=? and d.datetime=?";
		List<Dairy> list = this.getHibernateTemplate().find(hql,teacher,day);
		
		if (list.size()==0) {
			return null;
		}else{
			return list.get(0);
		}
	}

}
