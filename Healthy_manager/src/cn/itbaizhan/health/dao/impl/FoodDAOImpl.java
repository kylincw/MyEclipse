package cn.itbaizhan.health.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itbaizhan.health.dao.FoodDAOInter;
import cn.itbaizhan.health.po.Food;

public class FoodDAOImpl extends HibernateDaoSupport implements FoodDAOInter {

	public List<Food> find(int type) throws Exception {
		// TODO Auto-generated method stub
		String hql = "from Food f where f.type=?";
		List<Food> list=this.getHibernateTemplate().find(hql, type);
		return list;
	}

	public List<Food> find() throws Exception {
		String hql = "from Food";
		List<Food> list=this.getHibernateTemplate().find(hql);
		return list;
	}

	public Food find(Integer id) throws Exception {
		String hql = "from Food f where f.id=?";
		List<Food> list=this.getHibernateTemplate().find(hql,id);
		return list.get(0);
	}

}
