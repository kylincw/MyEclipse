package cn.itbaizhan.health.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itbaizhan.health.dao.ExamDAOInter;
import cn.itbaizhan.health.po.Exam;
import cn.itbaizhan.health.po.Teacher;

public class ExamDAOImpl extends HibernateDaoSupport implements ExamDAOInter {

	public List<Exam> find(Teacher teacher,final int pageSize) throws Exception {
		final String hql = "from Exam e where e.teacher=? order by e.datetime desc";
		final Teacher[] values=new Teacher[]{teacher};
		List<Exam> list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(hql);
						for (int i = 0; i < values.length; i++) {
							query.setParameter(i, values[i]);
						}
						List result = query.setFirstResult(0)
								.setMaxResults(pageSize).list();
						return result;
					}
				});
		return list;
	}
	
	public boolean delete(Integer id) throws Exception {
		boolean flag = false;
		Exam e = this.getHibernateTemplate().load(Exam.class, id);
		this.getHibernateTemplate().delete(e);
		flag = true;
		return flag;
	}

	public boolean save(Exam exam) throws Exception {
		this.getHibernateTemplate().save(exam);
		return true;
	}

}
