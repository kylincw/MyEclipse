package cn.itbaizhan.health.po;

import java.util.Date;

public class Exam {
	private Integer id;
	private Date datetime;
	private Teacher teacher;
	private String sbp;// 收缩压
	private String dbp;// 舒张压
	private String bmi;// 体重指数
	private String whr;// 腰臀比
	private String bun;// 尿素
	private String ua;// 尿酸
	private String crea;// 肌酐
	private String tg;// 甘油三酯
	private String chol;// 胆固醇
	private String hdl;// 高密度脂蛋白胆固醇
	private String ldl;// 低密度脂蛋白胆固醇
	private String glu;// 葡萄糖
	private String hcy;// 同型半膀胱氨酸
	private String m_alb;// 微量白蛋白
	private String m_alb_crea;// 微量白蛋白/尿肌酐

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getSbp() {
		return sbp;
	}

	public void setSbp(String sbp) {
		this.sbp = sbp;
	}

	public String getDbp() {
		return dbp;
	}

	public void setDbp(String dbp) {
		this.dbp = dbp;
	}

	public String getBmi() {
		return bmi;
	}

	public void setBmi(String bmi) {
		this.bmi = bmi;
	}

	public String getWhr() {
		return whr;
	}

	public void setWhr(String whr) {
		this.whr = whr;
	}

	public String getBun() {
		return bun;
	}

	public void setBun(String bun) {
		this.bun = bun;
	}

	public String getUa() {
		return ua;
	}

	public void setUa(String ua) {
		this.ua = ua;
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}

	public String getTg() {
		return tg;
	}

	public void setTg(String tg) {
		this.tg = tg;
	}

	public String getChol() {
		return chol;
	}

	public void setChol(String chol) {
		this.chol = chol;
	}

	public String getHdl() {
		return hdl;
	}

	public void setHdl(String hdl) {
		this.hdl = hdl;
	}

	public String getLdl() {
		return ldl;
	}

	public void setLdl(String ldl) {
		this.ldl = ldl;
	}

	public String getGlu() {
		return glu;
	}

	public void setGlu(String glu) {
		this.glu = glu;
	}

	public String getHcy() {
		return hcy;
	}

	public void setHcy(String hcy) {
		this.hcy = hcy;
	}

	public String getM_alb() {
		return m_alb;
	}

	public void setM_alb(String mAlb) {
		m_alb = mAlb;
	}

	public String getM_alb_crea() {
		return m_alb_crea;
	}

	public void setM_alb_crea(String mAlbCrea) {
		m_alb_crea = mAlbCrea;
	}

}
