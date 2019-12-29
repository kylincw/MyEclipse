package cn.itbaizhan.health.dao;

import cn.itbaizhan.health.po.Manager;

public interface ManagerDAOInter {

	public Manager find(Manager manager)throws Exception;
	
	public boolean delete(Integer id) throws Exception ;
	
	public boolean add(Manager manager) throws Exception ;
	
}
