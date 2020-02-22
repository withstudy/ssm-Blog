package com.blog.service;

import java.util.List;

import com.blog.model.User;

public interface UserService {
	
	public Boolean login(User user);
	
	public void add(User user);
	
	public User register(User user);
	
	public List<User> users();
}
