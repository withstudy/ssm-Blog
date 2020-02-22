package com.blog.service;

import java.util.List;

import com.blog.model.Category;
import com.blog.model.Page;
import com.blog.model.User;


public interface CategoryService {

	public List<Category> allCategory();
	
	public List<Category> allCategoryPage(Page<Category> page);
	
	public void deleteCategory(Integer delid);
	
	public Category findCategory(Integer editid);
	
	public void updateCategory(Category category);
	
	public void addCategory(Category category);
}
