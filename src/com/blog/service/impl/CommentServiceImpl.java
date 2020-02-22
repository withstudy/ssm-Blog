package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.CategoryDao;
import com.blog.dao.CommentDao;
import com.blog.dao.ContentDao;
import com.blog.model.Comment;
import com.blog.model.Content;
import com.blog.model.Page;
import com.blog.service.CommentService;
import com.blog.service.ContentService;

@Service("CommentService")
public class CommentServiceImpl implements CommentService{
	@Autowired
	private CommentDao commentDao;

	@Override
	public List<Comment> allComment(Integer id) {
		// TODO Auto-generated method stub
		return commentDao.allComment(id);
	}

	@Override
	public List<Comment> allCommentPage(Page<Comment> page) {
		// TODO Auto-generated method stub
		return commentDao.allCommentPage(page);
	}

	@Override
	public void deleteComment(Integer delid) {
		// TODO Auto-generated method stub
		commentDao.deleteComment(delid);
	}

	@Override
	public void delete_cid(Integer delid) {
		// TODO Auto-generated method stub
		commentDao.delete_cid(delid);
	}

	@Override
	public void delete_uid(Integer delid) {
		// TODO Auto-generated method stub
		commentDao.delete_uid(delid);
	}

	
}
