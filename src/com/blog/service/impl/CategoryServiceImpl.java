package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.CategoryDao;
import com.blog.model.Category;
import com.blog.model.Page;
import com.blog.model.User;
import com.blog.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> allCategory() {
		// TODO Auto-generated method stub
		return categoryDao.allCategory();
	}

	@Override
	public List<Category> allCategoryPage(Page<Category> page) {
		// TODO Auto-generated method stub
		return categoryDao.allCategoryPage(page);
	}

	@Override
	public void deleteCategory(Integer delid) {
		// TODO Auto-generated method stub
		categoryDao.deleteCategory(delid);
	}

	@Override
	public Category findCategory(Integer editid) {
		// TODO Auto-generated method stub
		return categoryDao.findCategory(editid);
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		categoryDao.updateCategory(category);
	}

	@Override
	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		categoryDao.addCategory(category);
	}

}
