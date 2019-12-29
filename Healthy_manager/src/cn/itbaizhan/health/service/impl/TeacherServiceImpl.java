package cn.itbaizhan.health.service.impl;

import cn.itbaizhan.health.dao.TeacherDAOInter;
import cn.itbaizhan.health.po.Teacher;
import cn.itbaizhan.health.service.TeacherServiceInter;

public class TeacherServiceImpl implements TeacherServiceInter {
	private TeacherDAOInter teacherDao;
	public void setTeacherDao(TeacherDAOInter teacherDao) {
		this.teacherDao = teacherDao;
	}
	/*---------------------------------------------------------*/
	public Teacher find(Teacher teacher) throws Exception {
		Teacher t=teacherDao.find(teacher);
		return t;
	}
	public Teacher add(Teacher teacher) throws Exception {
		teacherDao.add(teacher);
		Teacher t=teacherDao.find(teacher);
		return t;
	}
	
	public boolean delete(Integer id) throws Exception {
		return teacherDao.delete(id);
	}
	public Teacher find(String realname) throws Exception {
		return teacherDao.find(realname);
	}

}
