package cn.itbaizhan.health.action.base;

import cn.itbaizhan.health.service.FoodServiceInter;

import com.opensymphony.xwork2.ActionSupport;

public class FoodBaseAction extends ActionSupport {
	protected FoodServiceInter foodService;

	public void setFoodService(FoodServiceInter foodService) {
		this.foodService = foodService;
	}
	
	/*-----------------*/
	protected String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
