package cn.itbaizhan.health.dao;

import cn.itbaizhan.health.po.Teacher;

public interface TeacherDAOInter {

	public Teacher find(Teacher teacher) throws Exception;

	public boolean add(Teacher teacher) throws Exception;

	public boolean delete(Integer id) throws Exception;
	
	public Teacher find(String realname)throws Exception;
}
