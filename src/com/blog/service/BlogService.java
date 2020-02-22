package com.blog.service;

import java.util.List;

import com.blog.model.Page;
import com.blog.model.User;

public interface BlogService {
	
	public List<User> allUser();
	
	public List<User> allUserPage(Page<User> page);
	
	public void deleteUser(Integer delid);
	
	public User findUser(Integer editid);
	
	public void updateUser(User user);
}
