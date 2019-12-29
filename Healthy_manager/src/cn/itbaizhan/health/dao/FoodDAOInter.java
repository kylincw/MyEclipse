package cn.itbaizhan.health.dao;

import java.util.List;

import cn.itbaizhan.health.po.Food;

public interface FoodDAOInter {
	/**
	 * 按类型查找
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<Food> find(int type) throws Exception;
	/**
	 * 查找所有
	 * @return
	 * @throws Exception
	 */
	public List<Food> find() throws Exception;
	/**
	 * 根据id查找
	 * @return
	 * @throws Exception
	 */
	public Food find(Integer id) throws Exception;
}
