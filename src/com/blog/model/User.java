package com.blog.model;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String repassword;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	


	public User(Integer id, String username, String password, String repassword) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.repassword = repassword;
	}





	public String getRepassword() {
		return repassword;
	}





	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}





	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
