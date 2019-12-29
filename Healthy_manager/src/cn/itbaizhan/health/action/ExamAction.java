package cn.itbaizhan.health.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;

import cn.itbaizhan.health.action.base.ExamBaseAction;
import cn.itbaizhan.health.po.Exam;
import cn.itbaizhan.health.po.Teacher;
import cn.itbaizhan.health.service.impl.TeacherServiceImpl;
import cn.itbaizhan.health.util.ExcelFinalString;
import cn.itbaizhan.health.util.ExcelReader;
import cn.itbaizhan.health.vo.Highcharts;
import cn.itbaizhan.health.vo.Pages;

import com.opensymphony.xwork2.ActionContext;

public class ExamAction extends ExamBaseAction {
	ActionContext actionContext = ActionContext.getContext();
	Map<String, Object> session = actionContext.getSession();
	Teacher sessionTeacher = (Teacher) session.get("teacher");

	public String find() {
		try {
			examList = examService.find(sessionTeacher);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String show() {

		try {
			List<Exam> examList = examService.find(sessionTeacher);
			List<String> xdataList = new ArrayList<String>();
			List<Highcharts> ydataList = new ArrayList<Highcharts>();
			List<Double> bpHighList = new ArrayList<Double>();
			List<Double> bpLowList = new ArrayList<Double>();

			Highcharts highchart1 = new Highcharts();
			Highcharts highchart2 = new Highcharts();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时");
			String date = "";

			for (Exam e : examList) {
				bpHighList.add(Double.parseDouble(e.getSbp()));
				bpLowList.add(Double.parseDouble(e.getDbp()));
				date = sdf.format(e.getDatetime());
				xdataList.add(date);
			}

			highchart1.setName("舒张压");
			highchart1.setData(bpHighList);

			highchart2.setName("收缩压");
			highchart2.setData(bpLowList);

			ydataList.add(highchart1);
			ydataList.add(highchart2);

			jsonData.add(xdataList);
			jsonData.add(ydataList);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String examBackFindAll() {
		try {
			if (pages == null) {
				pages = new Pages();
			}
			if (pages.getPageSize() == null) {
				pages.setPageSize(10);
			}
			pages = pageService.findAll(pages, "Exam", "datetime");
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String examDelete() {
		try {
			boolean flag = examService.delete(id);
			if (flag) {
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		errorMessage = "教师体检信息删除失败！";
		return "error";
	}

	public String examSave() {
		try {
			ExcelReader excel = new ExcelReader();
			List<String[]> list = excel.getExcle(getFilePath().toString());
			boolean flag;
			String[] temp;
			for (int i = 0; i < list.size(); i++) {
				flag = false;
				temp = list.get(i);
				Exam exam = new Exam();
			    Date date = HSSFDateUtil.getJavaDate(Double.parseDouble(temp[ExcelFinalString.DATE])); 
				exam.setDatetime(date);
				exam.setSbp(temp[ExcelFinalString.SBP]);
				exam.setDbp(temp[ExcelFinalString.DBP]);
				exam.setBmi(temp[ExcelFinalString.BMI]);
				exam.setWhr(temp[ExcelFinalString.WHR]);
				exam.setBun(temp[ExcelFinalString.BUN]);
				exam.setUa(temp[ExcelFinalString.UA]);
				exam.setCrea(temp[ExcelFinalString.CREA]);
				exam.setTg(temp[ExcelFinalString.TG]);
				exam.setChol(temp[ExcelFinalString.CHOL]);
				exam.setHdl(temp[ExcelFinalString.HDL]);
				exam.setLdl(temp[ExcelFinalString.LDL]);
				exam.setGlu(temp[ExcelFinalString.GLU]);
				exam.setHcy(temp[ExcelFinalString.HCY]);
				exam.setM_alb(temp[ExcelFinalString.M_ALB]);
				exam.setM_alb_crea(temp[ExcelFinalString.M_ALB_CREA]);
	           Teacher teacher = teacherService.find(temp[ExcelFinalString.TEACHER_REALNAME]);
				exam.setTeacher(teacher);
				flag = examService.save(exam);
				if (!flag) {
					errorMessage = "第" + (i + 1) + "条记录入库失败";
					return "error";
				}
			}
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		errorMessage = "体检表入库失败";
		return "error";
	}

}
