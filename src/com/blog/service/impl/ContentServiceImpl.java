package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.CategoryDao;
import com.blog.dao.ContentDao;
import com.blog.model.Content;
import com.blog.model.Page;
import com.blog.service.ContentService;

@Service("contentService")
public class ContentServiceImpl implements ContentService{

	@Autowired
	private ContentDao contentDao;
	
	@Override
	public List<Content> allContent() {
		// TODO Auto-generated method stub
		return contentDao.allContent();
	}

	@Override
	public List<Content> allContentPage(Page<Content> page) {
		// TODO Auto-generated method stub
		return contentDao.allContentPage(page);
	}

	@Override
	public void deleteContent(Integer delid) {
		// TODO Auto-generated method stub
		contentDao.deleteContent(delid);
	}

	@Override
	public Content findContent(Integer editid) {
		// TODO Auto-generated method stub
		return contentDao.findContent(editid);
	}

	@Override
	public void updateContent(Content content) {
		// TODO Auto-generated method stub
		contentDao.updateContent(content);
	}

	@Override
	public void addContent(Content content) {
		// TODO Auto-generated method stub
		contentDao.addContent(content);
	}

}
