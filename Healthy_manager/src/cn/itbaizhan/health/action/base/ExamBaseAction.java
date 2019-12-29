package cn.itbaizhan.health.action.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.json.simple.JSONArray;

import cn.itbaizhan.health.po.Exam;
import cn.itbaizhan.health.service.ExamServiceInter;
import cn.itbaizhan.health.service.PageServiceInter;
import cn.itbaizhan.health.service.TeacherServiceInter;
import cn.itbaizhan.health.vo.Pages;

import com.opensymphony.xwork2.ActionSupport;

public class ExamBaseAction extends ActionSupport {
	protected ExamServiceInter examService;
	protected PageServiceInter pageService;
	protected TeacherServiceInter teacherService;
	
	public void setTeacherService(TeacherServiceInter teacherService) {
		this.teacherService = teacherService;
	}

	public void setPageService(PageServiceInter pageService) {
		this.pageService = pageService;
	}

	public void setExamService(ExamServiceInter examService) {
		this.examService = examService;
	}

	/*---------------*/
	protected List<Exam> examList;
	protected String errorMessage;
	protected JSONArray jsonData = new JSONArray();
	protected Pages pages;
	protected Integer id;
	protected File filePath;

	public File getFilePath() {
		return (this.filePath);
	}

	public void setFilePath(File filePath) {
		this.filePath = filePath;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pages getPages() {
		return pages;
	}

	public void setPages(Pages pages) {
		this.pages = pages;
	}

	public JSONArray getJsonData() {
		return jsonData;
	}

	public void setJsonData(JSONArray jsonData) {
		this.jsonData = jsonData;
	}

	public List<Exam> getExamList() {
		return examList;
	}

	public void setExamList(List<Exam> examList) {
		this.examList = examList;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
