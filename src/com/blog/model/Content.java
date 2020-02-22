package com.blog.model;

public class Content {
	private Integer id;
	private Integer u_id;
	private Integer c_id;
	private String title;
	private String comment;
	private String content;
	private String date;
	
	public Content() {
		// TODO Auto-generated constructor stub
	}

	
	public Content(Integer id, Integer u_id, Integer c_id, String title,
			String comment, String content, String date) {
		super();
		this.id = id;
		this.u_id = u_id;
		this.c_id = c_id;
		this.title = title;
		this.comment = comment;
		this.content = content;
		this.date = date;
	}


	public Integer getU_id() {
		return u_id;
	}


	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
