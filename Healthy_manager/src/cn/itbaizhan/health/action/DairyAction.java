package cn.itbaizhan.health.action;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import cn.itbaizhan.health.action.base.DairyBaseAction;
import cn.itbaizhan.health.po.Food;
import cn.itbaizhan.health.po.Teacher;

import com.opensymphony.xwork2.ActionContext;

public class DairyAction extends DairyBaseAction {
	ActionContext actionContext = ActionContext.getContext();
	Map<String, Object> session = actionContext.getSession();
	Teacher sessionTeacher = (Teacher) session.get("teacher");
	public String add() {
		boolean flag = false;
		try {
			dairy.setTeacher(sessionTeacher);
			
			Set<Food> foodSet=new HashSet<Food>();
			for (Integer id : foodSelect) {
				Food food=new Food();
				food=foodService.find(id);
				foodSet.add(food);
			}
			
			dairy.setFood(foodSet);
			flag = dairyService.add(dairy);
			if (flag) {
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String find() {
		try {
			foodList = foodService.findAll();
			dairy = dairyService.find(sessionTeacher,day);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
}
