package cn.itbaizhan.health.action;

import java.io.File;
import java.util.Date;
import java.util.Map;

import cn.itbaizhan.health.action.base.NoticeBaseAction;
import cn.itbaizhan.health.po.Manager;
import cn.itbaizhan.health.po.Notice;
import cn.itbaizhan.health.util.FileOperation;
import cn.itbaizhan.health.vo.Pages;

import com.opensymphony.xwork2.ActionContext;

public class NoticeAction extends NoticeBaseAction {
	public String show() {
		try {
			int num = 4;
			noticeList = noticeService.find(num);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	public String noticeFind(){
		try {
			notice = noticeService.findById(id);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		errorMessage="查无此新闻！";
		return "error";
	}
	
	public String add(){
		try {
			Notice n=noticeService.findById(notice.getId());
			n.setContent(notice.getContent());
			n.setTitle(notice.getTitle());
			boolean flag = noticeService.saveOrUpdate(n);
			if(flag){
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String noticeBackFindAll() {
		try {
			if (pages == null) {
				pages = new Pages();
			}
			if (pages.getPageSize() == null) {
				pages.setPageSize(10);
			}
			pages = pageService.findAll(pages, "Notice", "datetime");
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	public String noticeDelete(){
		try {
			notice = noticeService.findById(id);
			String filename=notice.getImagepath();
			boolean flag = noticeService.delete(notice);
			if(flag){
				File file = new File(getSavePath() + "\\"+filename.substring(filename.lastIndexOf("/")+1, filename.length()));
				file.delete();
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		errorMessage="新闻删除失败！";
		return "error";
	}
	
	public String noticeAdd(){
		try {
			notice.setDatetime(new Date());
			//setManager
			ActionContext actionContext = ActionContext.getContext();
			Map<String, Object> session = actionContext.getSession();
			Manager manager=(Manager)session.get("manager");
			notice.setManager(manager);
			//setImagepath
			String filterResult = filterType(this.getAllowTypes().split(","));
			if (filterResult != null) {
				errorMessage="您要上传的文件类型不正确！";
				return "error";
			}
			String newFileName=getUploadFileName();
			FileOperation.Dec_COPY_FILE(getSavePath() + "\\"+ newFileName, getUpload().toString());
			notice.setImagepath(savePath.substring(1, savePath.length())+"/"+newFileName);
			//存入库
			noticeService.add(notice);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		errorMessage="健康新闻添加失败！";
		return "error";
	}
	
}
