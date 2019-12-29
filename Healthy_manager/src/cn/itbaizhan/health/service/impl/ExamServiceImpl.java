package cn.itbaizhan.health.service.impl;

import java.util.List;

import cn.itbaizhan.health.dao.ExamDAOInter;
import cn.itbaizhan.health.po.Exam;
import cn.itbaizhan.health.po.Teacher;
import cn.itbaizhan.health.service.ExamServiceInter;

public class ExamServiceImpl implements ExamServiceInter {
	private ExamDAOInter examDao;

	public void setExamDao(ExamDAOInter examDao) {
		this.examDao = examDao;
	}

	public List<Exam> find(Teacher teacher) throws Exception {
		List<Exam> list = examDao.find(teacher, 10);
		return list;
	}
	
	public boolean delete(Integer id) throws Exception {
		return examDao.delete(id);
	}

	public boolean save(Exam exam) throws Exception {
		return examDao.save(exam);
	}
}
