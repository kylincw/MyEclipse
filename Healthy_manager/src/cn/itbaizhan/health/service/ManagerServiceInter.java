package cn.itbaizhan.health.service;

import cn.itbaizhan.health.po.Manager;
import cn.itbaizhan.health.vo.Pages;

public interface ManagerServiceInter {

	public Manager find(Manager manager)throws Exception;
	
	public boolean delete(Integer id) throws Exception ;
	
	public boolean add(Manager manager)throws Exception;

}
