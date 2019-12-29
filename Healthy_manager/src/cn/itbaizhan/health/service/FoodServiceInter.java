package cn.itbaizhan.health.service;

import java.util.List;

import cn.itbaizhan.health.po.Food;

public interface FoodServiceInter {
	/**
	 * 一天的食物列表
	 * @return
	 * @throws Exception
	 */
	public List<Food> find() throws Exception;
	/**
	 * 所有的食物列表
	 * @return
	 * @throws Exception
	 */
	public List<Food> findAll()throws Exception;
	/**
	 * 根据id查找食物
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Food find(Integer id)throws Exception;
}
