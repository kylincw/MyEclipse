package cn.itbaizhan.health.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itbaizhan.health.dao.PageDAOInter;

public class PageDAOImpl extends HibernateDaoSupport implements PageDAOInter {

	public List findByPage(final String hql, final int pageNow,final int pageSize) throws Exception {
		List list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)throws HibernateException, SQLException {
						List result = session.createQuery(hql).setFirstResult(pageNow).setMaxResults(pageSize).list();
						return result;
					}
				});
		return list;
	}

	public List findByPage(final String hql, final String value,
			final int pageNow, final int pageSize) throws Exception {
		List list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List result = session.createQuery(hql).setParameter(0,
								value).setFirstResult(pageNow).setMaxResults(
								pageSize).list();
						return result;
					}
				});
		return list;
	}

	public List findByPage(final String hql, final Object[] values,
			final int pageNow, final int pageSize) throws Exception {
		List list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(hql);
						for (int i = 0; i < values.length; i++) {
							query.setParameter(i, values[i]);
						}
						List result = query.setFirstResult(pageNow)
								.setMaxResults(pageSize).list();
						return result;
					}
				});
		return list;
	}

	public Long findRecordCount(String recordName) throws Exception {
		long num = (Long) this.getHibernateTemplate().find("select count(*) from " + recordName).get(0);
		return num;
	}

}
