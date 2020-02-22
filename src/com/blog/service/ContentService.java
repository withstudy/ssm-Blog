package com.blog.service;

import java.util.List;

import com.blog.model.Category;
import com.blog.model.Content;
import com.blog.model.Page;
import com.blog.model.User;


public interface ContentService {

	public List<Content> allContent();
	
	public List<Content> allContentPage(Page<Content> page);
	
	public void deleteContent(Integer delid);
	
	public Content findContent(Integer editid);
	
	public void updateContent(Content content);
	
	public void addContent(Content content);
}
