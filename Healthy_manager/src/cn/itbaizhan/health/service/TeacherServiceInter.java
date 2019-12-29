package cn.itbaizhan.health.service;

import cn.itbaizhan.health.po.Teacher;
import cn.itbaizhan.health.vo.Pages;

public interface TeacherServiceInter {

	public Teacher find(Teacher teacher)throws Exception;

	public Teacher add(Teacher teacher)throws Exception;
	
	public boolean delete(Integer id) throws Exception ;
	
	public Teacher find(String realname)throws Exception;
	
}
