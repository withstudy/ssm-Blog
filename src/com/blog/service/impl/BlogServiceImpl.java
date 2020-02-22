package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.BlogDao;
import com.blog.model.Page;
import com.blog.model.User;
import com.blog.service.BlogService;

@Service("blogService")
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;
	@Override
	public List<User> allUser() {
		// TODO Auto-generated method stub
		return blogDao.allUser();
	}
	
	@Override
	public List<User> allUserPage(Page<User> page) {
		// TODO Auto-generated method stub
		return blogDao.allUserPage(page);
	}

	@Override
	public void deleteUser(Integer delid) {
		// TODO Auto-generated method stub
		blogDao.deleteUser(delid);
	}

	@Override
	public User findUser(Integer editid) {
		// TODO Auto-generated method stub
		return blogDao.findUser(editid);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		blogDao.updateUser(user);
	}

}
