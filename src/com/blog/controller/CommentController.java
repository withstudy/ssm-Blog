package com.blog.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.blog.model.Category;
import com.blog.model.Comment;
import com.blog.model.Content;
import com.blog.model.Page;
import com.blog.model.User;
import com.blog.service.BlogService;
import com.blog.service.CategoryService;
import com.blog.service.CommentService;
import com.blog.service.ContentService;
import com.blog.service.UserService;
import com.blog.validator.UserValidator;

@Controller
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/commentindex")
	public ModelAndView toUserList(HttpSession session,Integer currPage,Integer c_id){
		User loginuser = (User) session.getAttribute("user");
		ModelAndView mav=new ModelAndView();
		//List<User> list = blogService.allUser();
		Page<Comment> page = new Page<Comment>();
		if(currPage == null){
			page.setCurrPage(1);
		}else{
			page.setCurrPage(currPage);
		}
		page.setTotalCount(commentService.allComment(c_id).size());
		page.setTotalPage();
		page.setStart();
		page.setCom_id(c_id);
		page.setLists(commentService.allCommentPage(page));
		
		mav.addObject("user",loginuser);
		mav.addObject("page", page);
		mav.addObject("contentid", c_id);
		mav.setViewName("comment/index");
		return mav;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam(value="id",required=false)Integer delid,HttpSession session,Integer c_id){
		ModelAndView mav=new ModelAndView();
		commentService.deleteComment(delid);
		mav.addObject("message", "É¾³ý³É¹¦!");
		mav.addObject("user", session.getAttribute("user"));
		mav.addObject("url", "/comment/commentindex.xhb?id="+c_id);
		mav.setViewName("success");
		return mav;
	}
	
	
	
	
	
}
