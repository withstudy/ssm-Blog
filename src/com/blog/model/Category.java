package com.blog.model;

public class Category {
	private Integer id;
	private String name;
	private String comment;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(Integer id, String name, String comment) {
		super();
		this.id = id;
		this.name = name;
		this.comment = comment;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
