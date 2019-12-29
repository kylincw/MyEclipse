package cn.itbaizhan.health.action.base;

import java.util.List;

import cn.itbaizhan.health.po.Dairy;
import cn.itbaizhan.health.po.Food;
import cn.itbaizhan.health.service.DairyServiceInter;
import cn.itbaizhan.health.service.FoodServiceInter;

import com.opensymphony.xwork2.ActionSupport;

public class DairyBaseAction extends ActionSupport {
	protected DairyServiceInter dairyService;
	protected FoodServiceInter foodService;

	public void setFoodService(FoodServiceInter foodService) {
		this.foodService = foodService;
	}

	public void setDairyService(DairyServiceInter dairyService) {
		this.dairyService = dairyService;
	}

	/*---------------*/
	protected Dairy dairy;
	protected List<Food> foodList;
	protected String day;
	protected Integer[] foodSelect;
	protected String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer[] getFoodSelect() {
		return foodSelect;
	}

	public void setFoodSelect(Integer[] foodSelect) {
		this.foodSelect = foodSelect;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Dairy getDairy() {
		return dairy;
	}

	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}
}
