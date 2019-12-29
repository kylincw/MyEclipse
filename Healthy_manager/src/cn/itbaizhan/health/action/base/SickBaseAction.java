package cn.itbaizhan.health.action.base;

import cn.itbaizhan.health.vo.Sick;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SickBaseAction extends ActionSupport implements ModelDriven<Sick>{
	protected Sick sick=new Sick();
	protected double result;

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public Sick getSick() {
		return sick;
	}



	@Override
	public Sick getModel() {
		// TODO Auto-generated method stub
		return sick;
	}
}
