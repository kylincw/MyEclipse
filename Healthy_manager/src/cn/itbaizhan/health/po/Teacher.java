package cn.itbaizhan.health.po;

import java.util.Set;
import java.util.TreeSet;

import cn.itbaizhan.health.po.Dairy;

public class Teacher {
	private Integer id;
	private String name;
	private String password;
	private Integer age;
	private String sex;
	private String email;
	private String question;
	private String answer;
	private String phone;
	private String realname;
	private Set<Dairy> dairy = new TreeSet<Dairy>();

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<Dairy> getDairy() {
		return dairy;
	}

	public void setDairy(Set<Dairy> dairy) {
		this.dairy = dairy;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

}
