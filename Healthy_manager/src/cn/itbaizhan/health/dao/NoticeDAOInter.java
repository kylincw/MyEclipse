package cn.itbaizhan.health.dao;

import java.util.List;

import cn.itbaizhan.health.po.Notice;

public interface NoticeDAOInter {

	public List<Notice> find(final int num)throws Exception;
	
	public boolean delete(Notice notice) throws Exception ;
	
	public Notice findById(int id)throws Exception;
	
	public boolean saveOrUpdate(Notice notice) throws Exception;
	
	public boolean add(Notice notice) throws Exception ;
	
}
