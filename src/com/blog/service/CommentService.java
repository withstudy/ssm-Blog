package com.blog.service;

import java.util.List;

import com.blog.model.Category;
import com.blog.model.Comment;
import com.blog.model.Content;
import com.blog.model.Page;
import com.blog.model.User;


public interface CommentService {

	public List<Comment> allComment(Integer id);
	
	public List<Comment> allCommentPage(Page<Comment> page);
	
	public void deleteComment(Integer delid);
	
	public void delete_cid(Integer delid);
	
	public void delete_uid(Integer delid);
	
}
