package com.blog.model;



import java.util.List;

public class Page<T> {
	 
	private Integer com_id;
	private int currPage;//��ǰҳ��
    private int pageSize=5;//ÿҳ��ʾ�ļ�¼��
    private int totalCount;//�ܼ�¼��
    private int totalPage;//��ҳ��
    private List<T> lists;//ÿҳ����ʾ������
    private int start;
	public int getStart() {
		return start;
	}
	public void setStart() {
		
		this.start = (this.currPage-1)*this.pageSize;
	}
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage() {
		if(this.totalCount%this.pageSize == 0){
			this.totalPage= this.totalCount/this.pageSize;
		}else{
			this.totalPage= this.totalCount/this.pageSize+1;
		}
		
	}
	public List<T> getLists() {
		return lists;
	}
	public void setLists(List<T> lists) {
		this.lists = lists;
	}
	public Integer getCom_id() {
		return com_id;
	}
	public void setCom_id(Integer com_id) {
		this.com_id = com_id;
	}
	
    
}
