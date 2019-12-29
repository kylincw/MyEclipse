package cn.itbaizhan.health.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itbaizhan.health.dao.NoticeDAOInter;
import cn.itbaizhan.health.po.Notice;

public class NoticeDAOImpl extends HibernateDaoSupport implements
		NoticeDAOInter {

	public List<Notice> find(final int num) throws Exception {
		final String hql = "from Notice n order by n.datetime desc";
		List<Notice> list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List result = session.createQuery(hql).setMaxResults(
								num).list();
						return result;
					}
				});
		return list;
	}

	public boolean delete(Notice notice) throws Exception {
		boolean flag = false;
		this.getHibernateTemplate().delete(notice);
		flag = true;
		return flag;
	}

	public Notice findById(int id) throws Exception {
		List<Notice> list = this.getHibernateTemplate().find("from Notice n where n.id=?", id);
		return list.get(0);
	}

	public boolean saveOrUpdate(Notice notice) throws Exception {
		boolean flag = false;
		this.getHibernateTemplate().saveOrUpdate(notice);
		flag = true;
		return flag;
	}
	
	public boolean add(Notice notice) throws Exception {
		boolean flag = false;
		this.getHibernateTemplate().save(notice);
		flag = true;
		return flag;
	}

}
