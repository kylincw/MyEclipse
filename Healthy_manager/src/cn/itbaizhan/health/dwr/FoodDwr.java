package cn.itbaizhan.health.dwr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.itbaizhan.health.po.Food;
import cn.itbaizhan.health.service.FoodServiceInter;
import cn.itbaizhan.health.vo.Ree;

import org.apache.commons.beanutils.BeanUtils;

public class FoodDwr {
	public Double heatCalculate(Map formMap) {
		Ree ree = new Ree();
		double result = 0;
		try {
			BeanUtils.populate(ree, formMap);
			int sex = ree.getSex();
			int age = ree.getAgegroup();
			double weight = ree.getWeight();
			if (0 == sex) {
				switch (age) {
				case 1:
					result = 14.6 * weight + 450;
					break;
				case 2:
					result = 8.6 * weight + 830;
					break;
				case 3:
					result = 10.4 * weight + 600;
					break;
				}
			}
			if (1 == sex) {
				switch (age) {
				case 1:
					result = 15.2 * weight + 680;
					break;
				case 2:
					result = 11.5 * weight + 830;
					break;
				case 3:
					result = 13.4 * weight + 490;
					break;
				}
			}
			double coefficient = ree.getCoefficient();
			result = coefficient * result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List showFoods() {
		List list = new ArrayList();
		try {
			for(int i=0;i<7;i++){
				list.add(foodService.find());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/*------------*/
	private FoodServiceInter foodService;

	public void setFoodService(FoodServiceInter foodService) {
		this.foodService = foodService;
	}
}
