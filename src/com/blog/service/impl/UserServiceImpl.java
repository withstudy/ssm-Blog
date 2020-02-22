package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.UserDao;
import com.blog.model.User;
import com.blog.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private  UserDao userDao;
	
	@Override
	public Boolean login(User user) {
		// TODO Auto-generated method stub
		if(userDao.login(user) != null){
			return true;
		}
		return false;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		return userDao.register(user);
			
	}

	@Override
	public List<User> users() {
		// TODO Auto-generated method stub
		return userDao.users();
	}

}
