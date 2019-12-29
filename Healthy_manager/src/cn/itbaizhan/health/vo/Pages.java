package cn.itbaizhan.health.vo;

import java.util.List;

public class Pages {
	private List<?> pageList;// 返回分页数据集合
	private Integer pageCurrent = 1;// 当前页面页数(默认1)
	private Long recordCount;// 记录总数
	private Integer pageCount;// 页面总数
	private Integer pageNow = 0;// 当前页面第一条数据在数据中的位置(默认0)
	private Integer pageSize;// 每页页面显示数
	private Integer pageDetail=5;//两侧详细页面数量(默认5)

	public List<?> getPageList() {
		return pageList;
	}

	public void setPageList(List<?> pageList) {
		this.pageList = pageList;
	}

	public Integer getPageCurrent() {
		return pageCurrent;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public Integer getPageNow() {
		return (pageCurrent - 1) * pageSize;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Long getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Long recordCount) {
		this.recordCount = recordCount;
	}

	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	public void setPageCount() {
		int remainder = (int) (recordCount % pageSize);
		if (remainder == 0) {
			this.pageCount = (int) (recordCount / pageSize);
		} else {
			this.pageCount = (int) (recordCount / pageSize + 1);
		}
	}

	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}

	public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
	}

	public void setPageDetail(Integer pageDetail) {
		this.pageDetail = pageDetail;
	}

	public Integer getPageDetail() {
		return pageDetail;
	}
}
