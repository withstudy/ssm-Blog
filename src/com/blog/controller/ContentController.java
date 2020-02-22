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
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/contentindex")
	public ModelAndView toUserList(HttpSession session,Integer currPage){
		User loginuser = (User) session.getAttribute("user");
		ModelAndView mav=new ModelAndView();
		//List<User> list = blogService.allUser();
		Page<Content> page = new Page<Content>();
		if(currPage == null){
			page.setCurrPage(1);
		}else{
			page.setCurrPage(currPage);
		}
		page.setTotalCount(contentService.allContent().size());
		page.setTotalPage();
		page.setStart();
		page.setLists(contentService.allContentPage(page));
		
		List<User> users = userService.users();
		List<Category> categorys = categoryService.allCategory();
		mav.addObject("user",loginuser);
		mav.addObject("page", page);
		mav.addObject("users", users);
		mav.addObject("categorys", categorys);
		mav.setViewName("content/index");
		return mav;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam(value="id",required=false)Integer delid,HttpSession session){
		ModelAndView mav=new ModelAndView();
		commentService.delete_cid(delid);
		contentService.deleteContent(delid);
		mav.addObject("message", "删除成功!");
		mav.addObject("user", session.getAttribute("user"));
		mav.addObject("url", "/content/contentindex.xhb");
		mav.setViewName("success");
		return mav;
	}
	
	@RequestMapping("/toedit")
	public ModelAndView toEdit(@RequestParam(value="id",required=false)Integer editid,HttpSession session){
		ModelAndView mav=new ModelAndView();
		Content content = contentService.findContent(editid);
		mav.addObject("editcontent",content);
		mav.addObject("categorys", categoryService.allCategory());
		mav.setViewName("content/edit");
		mav.addObject("user", session.getAttribute("user"));
		return mav;
	}
	@RequestMapping("/edit")
	public ModelAndView edit(Content editcontent,HttpSession session){
		ModelAndView mav=new ModelAndView();
		contentService.updateContent(editcontent);
		mav.addObject("message", "修改成功!");
		mav.addObject("user", session.getAttribute("user"));
		mav.addObject("url", "/content/contentindex.xhb");
		mav.setViewName("success");
		return mav;
	}
	
	@RequestMapping("/toadd")
	public ModelAndView toAdd(HttpSession session){
		ModelAndView mav=new ModelAndView();
		mav.addObject("categorys", categoryService.allCategory());
		mav.setViewName("content/add");
		mav.addObject("user", session.getAttribute("user"));
		return mav;
	}
	@RequestMapping("/add")
	public ModelAndView add(Content addcontent,HttpSession session){
		DateFormat df= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		ModelAndView mav=new ModelAndView();
		addcontent.setDate(df.format(date));
		User user = (User) session.getAttribute("user");
		User getuser = userService.register(user);
		addcontent.setU_id(getuser.getId());
		contentService.addContent(addcontent);
		
		mav.addObject("message", "添加成功!");
		mav.addObject("user", session.getAttribute("user"));
		mav.addObject("url", "/content/contentindex.xhb");
		mav.setViewName("success");
		return mav;
	}
	
	
	
}
