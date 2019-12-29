package cn.itbaizhan.health.service.impl;

import java.util.List;

import cn.itbaizhan.health.dao.NoticeDAOInter;
import cn.itbaizhan.health.po.Manager;
import cn.itbaizhan.health.po.Notice;
import cn.itbaizhan.health.service.NoticeServiceInter;

public class NoticeServiceImpl implements NoticeServiceInter {
	private NoticeDAOInter noticeDao;

	public void setNoticeDao(NoticeDAOInter noticeDao) {
		this.noticeDao = noticeDao;
	}
	/*---------------------*/
	public List<Notice> find(int num) throws Exception {
		// TODO Auto-generated method stub
		List<Notice> list = noticeDao.find(num);
		return list;
	}
	public boolean delete(Notice notice) throws Exception {
		return noticeDao.delete(notice);
	}
	public Notice findById(int id) throws Exception {
		return noticeDao.findById(id);
	}
	public boolean saveOrUpdate(Notice notice) throws Exception {
		return noticeDao.saveOrUpdate(notice);
	}
	public boolean add(Notice notice) throws Exception {
		return noticeDao.add(notice);
	}
}
