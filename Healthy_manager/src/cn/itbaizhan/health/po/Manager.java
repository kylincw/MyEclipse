package cn.itbaizhan.health.po;

import java.util.Set;
import java.util.TreeSet;

public class Manager {
	private Integer id;
	private String name;
	private String password;
	private Set<Notice> notice = new TreeSet<Notice>();

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Notice> getNotice() {
		return notice;
	}

	public void setNotice(Set<Notice> notice) {
		this.notice = notice;
	}

}
