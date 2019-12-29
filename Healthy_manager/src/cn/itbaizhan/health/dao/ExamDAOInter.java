package cn.itbaizhan.health.dao;

import java.util.List;

import cn.itbaizhan.health.po.Exam;
import cn.itbaizhan.health.po.Teacher;

public interface ExamDAOInter {
	/**
	 * 查找session中的teacher最近n条记录
	 * @param teacher
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<Exam> find(Teacher teacher,final int pageSize) throws Exception;
	
	public boolean delete(Integer id) throws Exception ;
	
	public boolean save(Exam exam) throws Exception ;

}
