package cn.itbaizhan.health.po;

import java.util.HashSet;
import java.util.Set;

public class Active {
	private Integer id;
	private String name;
	private Double time;
	private Double heat;
	private Set<Dairy> dairy = new HashSet<Dairy>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	public Double getHeat() {
		return heat;
	}

	public void setHeat(Double heat) {
		this.heat = heat;
	}

	public Set<Dairy> getDairy() {
		return dairy;
	}

	public void setDairy(Set<Dairy> dairy) {
		this.dairy = dairy;
	}
}
