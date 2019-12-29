package cn.itbaizhan.health.dao;

import cn.itbaizhan.health.po.Dairy;
import cn.itbaizhan.health.po.Teacher;

public interface DairyDAOInter {
	/**
	 * 添加日志
	 * @param dairy
	 * @return
	 * @throws Exception
	 */
	public boolean add(Dairy dairy)throws Exception;
	/**
	 * 根据session与日期查找日志
	 * @param teacher
	 * @param day
	 * @return
	 * @throws Exception
	 */
	public Dairy find(Teacher teacher,String day)throws Exception;
}
