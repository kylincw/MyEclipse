package cn.itbaizhan.health.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cn.itbaizhan.health.dao.FoodDAOInter;
import cn.itbaizhan.health.po.Food;
import cn.itbaizhan.health.service.FoodServiceInter;

public class FoodServiceImpl implements FoodServiceInter {
	private FoodDAOInter foodDao;

	public void setFoodDao(FoodDAOInter foodDao) {
		this.foodDao = foodDao;
	}

	public List<Food> find() throws Exception {
		// TODO Auto-generated method stub
		List<Food> list_day=new ArrayList<Food>();
		List<Food> list_type=new ArrayList<Food>();
		Food f=new Food();
		for(int type=1;type<=12;type++){
			list_type=foodDao.find(type);
			Random random=new Random();
			int i=random.nextInt(list_type.size());
			f=list_type.get(i);
			list_day.add(f);
		}
		return list_day;
	}

	public List<Food> findAll() throws Exception {
		return foodDao.find();
	}

	public Food find(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return foodDao.find(id);
	}
}
