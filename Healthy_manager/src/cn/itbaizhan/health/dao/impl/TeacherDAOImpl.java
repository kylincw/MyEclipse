package cn.itbaizhan.health.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itbaizhan.health.dao.TeacherDAOInter;
import cn.itbaizhan.health.po.Teacher;

public class TeacherDAOImpl extends HibernateDaoSupport implements
		TeacherDAOInter {

	public Teacher find(Teacher teacher) throws Exception {
		String hql = "from Teacher t where t.name=? and t.password=?";
		String[] str = new String[] { teacher.getName(), teacher.getPassword() };
		List<Teacher> list = this.getHibernateTemplate().find(hql, str);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public boolean add(Teacher teacher) throws Exception {
		this.getHibernateTemplate().save(teacher);
		return true;
	}
	
	public boolean delete(Integer id) throws Exception {
		boolean flag = false;
		Teacher t = this.getHibernateTemplate().load(Teacher.class, id);
		this.getHibernateTemplate().delete(t);
		flag = true;
		return flag;
	}

	public Teacher find(String realname) throws Exception {
		String hql="from Teacher t where t.realname=?";
		List<Teacher> list=this.getHibernateTemplate().find(hql, realname);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

}
