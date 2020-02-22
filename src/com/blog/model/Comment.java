package com.blog.model;

public class Comment {
	private Integer id;
	private Integer u_id;
	private Integer c_id;
	private String content;
	private String time;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(Integer id, Integer u_id, Integer c_id, String content,
			String time) {
		super();
		this.id = id;
		this.u_id = u_id;
		this.c_id = c_id;
		this.content = content;
		this.time = time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}
