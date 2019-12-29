package cn.itbaizhan.health.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Dairy {
	private String datetime;
	private String text;
	private Double sleephour;
	private String mood;
	private Integer cigarette;
	private Double weight;
	private String pressure;
	private Double bpHigh;
	private Double bpLow;
	private Double bs;
	private Teacher teacher;
	private Set<Food> food = new HashSet<Food>();
	private Set<Active> active = new HashSet<Active>();
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Double getSleephour() {
		return sleephour;
	}
	public void setSleephour(Double sleephour) {
		this.sleephour = sleephour;
	}
	public String getMood() {
		return mood;
	}
	public void setMood(String mood) {
		this.mood = mood;
	}
	public Integer getCigarette() {
		return cigarette;
	}
	public void setCigarette(Integer cigarette) {
		this.cigarette = cigarette;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getPressure() {
		return pressure;
	}
	public void setPressure(String pressure) {
		this.pressure = pressure;
	}
	public Double getBpHigh() {
		return bpHigh;
	}
	public void setBpHigh(Double bpHigh) {
		this.bpHigh = bpHigh;
	}
	public Double getBpLow() {
		return bpLow;
	}
	public void setBpLow(Double bpLow) {
		this.bpLow = bpLow;
	}
	public Double getBs() {
		return bs;
	}
	public void setBs(Double bs) {
		this.bs = bs;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Set<Food> getFood() {
		return food;
	}
	public void setFood(Set<Food> food) {
		this.food = food;
	}
	public Set<Active> getActive() {
		return active;
	}
	public void setActive(Set<Active> active) {
		this.active = active;
	}

}
