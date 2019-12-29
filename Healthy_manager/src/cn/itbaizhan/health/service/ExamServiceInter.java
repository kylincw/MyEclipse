package cn.itbaizhan.health.service;

import java.util.List;

import cn.itbaizhan.health.po.Exam;
import cn.itbaizhan.health.po.Teacher;
import cn.itbaizhan.health.vo.Pages;

public interface ExamServiceInter {
	/**
	 * 查询session中teacher最近n条记录
	 * @param teacher
	 * @return
	 * @throws Exception
	 */
	public List<Exam> find(Teacher teacher) throws Exception;
	
	public boolean delete(Integer id) throws Exception ;
	
	public boolean save(Exam exam) throws Exception ;
}
