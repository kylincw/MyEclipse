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

import cn.itbaizhan.health.po.Notice;
import cn.itbaizhan.health.service.NoticeServiceInter;
import cn.itbaizhan.health.service.PageServiceInter;
import cn.itbaizhan.health.vo.Pages;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class NoticeBaseAction extends ActionSupport {
	protected NoticeServiceInter noticeService;
	protected PageServiceInter pageService;

	public void setPageService(PageServiceInter pageService) {
		this.pageService = pageService;
	}
	public void setNoticeService(NoticeServiceInter noticeService) {
		this.noticeService = noticeService;
	}

	/*-------------------------*/
	protected List<Notice> noticeList;
	protected String errorMessage;
	protected Pages pages;
	protected Integer id;
	protected Notice notice;

	public Notice getNotice() {
		return notice;
	}
	public void setNotice(Notice notice) {
		this.notice = notice;
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

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<Notice> getNoticeList() {
		return noticeList;
	}

	public void setNoticeList(List<Notice> noticeList) {
		this.noticeList = noticeList;
	}
	
	
	
	/****文件上传所需属性开始****/
	protected File upload;// 上传文件的对象
	protected String uploadContentType;// 上传文件类型
	protected String uploadFileName;// 上传文件的文件名称
	protected String allowTypes;// 允许通过的文件类型
	protected String savePath="/photos"; // 接受依赖注入的属性

	// 接受依赖注入的方法
	public void setSavePath(String value) {
		this.savePath = value;
	}

	protected String getSavePath() throws Exception {
		/**
		 * will modify savePath 写到资源文件里
		 */
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		String[] istype=uploadFileName.split("\\.");
		String type=null;
		for(int i=0;i<istype.length;i++){
			type=istype[i];
		}
		String date=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		this.uploadFileName = date+"."+type;
	}

	public File getUpload() {
		return (this.upload);
	}

	public String getAllowTypes() {
		return allowTypes;
	}

	public void setAllowTypes(String allowTypes) {
		this.allowTypes = allowTypes;
	}

	

	public String filterType(String[] types) {
		String fileType = this.getUploadContentType();
		for (String type : types) {
			if (type.equals(fileType)) {
				return null;
			}
		}
		return INPUT;
	}
	
	/****文件上传所需属性结束****/

}
