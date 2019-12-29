package cn.itbaizhan.health.dao;

import java.util.List;

public interface PageDAOInter {
/**
 * 分页
 * @param hql
 * @param pageNow 当前页面第一条数据在数据中的位置
 * @param pageSize 每页页面显示的结果数
 * @return list数据集合
 */
	public List findByPage(final String hql, final int pageNow,
			final int pageSize) throws Exception;
/**
 * 
 * @param hql
 * @param value ?的值
 * @param pageNow 当前页面第一条数据在数据中的位置
 * @param pageSize 每页页面显示的结果数
 * @return list数据集合
 */
	public List findByPage(final String hql, final String value,
			final int pageNow, final int pageSize) throws Exception;
/**
 * 
 * @param hql
 * @param values ?的赋值集合
 * @param pageNow 当前页面第一条数据在数据中的位置
 * @param pageSize 每页页面显示的结果数
 * @return list数据集合
 */
	public List findByPage(final String hql, final Object[] values,
			final int pageNow, final int pageSize) throws Exception;
	/**
	 * 查询记录总数
	 * @param recordName 实体类名字(可带条件)
	 * @return 返回记录总数
	 */
	public Long findRecordCount(String recordName) throws Exception; 
}
