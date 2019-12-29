package cn.itbaizhan.health.action;

import cn.itbaizhan.health.action.base.SickBaseAction;

public class SickAction extends SickBaseAction {
	public String evaluate(){
		System.out.println(
				sick.getAgeGroup()+""+
				sick.getBpHigh()+""+
				sick.getBs()+""+
				sick.getExerciseGroup()+""+
				sick.isHistoryFamilyHypertension()
		);
		return SUCCESS;
	}
}
