package cn.itbaizhan.health.service;

import java.util.List;

import cn.itbaizhan.health.po.Notice;

public interface NoticeServiceInter {

	public List<Notice> find(int num)throws Exception;
	public Notice findById(int id)throws Exception;
	
	public boolean delete(Notice notice) throws Exception ;
	
	public boolean saveOrUpdate(Notice notice) throws Exception;
	
	public boolean add(Notice notice)throws Exception;
	
}
