package com.blog.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.blog.model.Page;
import com.blog.model.User;
import com.blog.service.BlogService;
import com.blog.service.CommentService;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/index")
	public String loginForm(Model model,HttpSession session){
		User loginuser = (User) session.getAttribute("user");
		if(loginuser != null){
			model.addAttribute("user",loginuser);
		}
		
		return "base";
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam(value="id",required=false)Integer delid,HttpSession session){
		ModelAndView mav=new ModelAndView();
		commentService.delete_uid(delid);
		blogService.deleteUser(delid);
		mav.addObject("message", "删除成功!");
		mav.addObject("user", session.getAttribute("user"));
		mav.addObject("url", "/blog/userindex.xhb");
		mav.setViewName("success");
		return mav;
	}
	
	@RequestMapping("/toedit")
	public ModelAndView toEdit(@RequestParam(value="id",required=false)Integer editid,HttpSession session){
		ModelAndView mav=new ModelAndView();
		User user = blogService.findUser(editid);
		mav.addObject("edituser",user);
		mav.setViewName("user/edit");
		mav.addObject("user", session.getAttribute("user"));
		return mav;
	}
	@RequestMapping("/edit")
	public ModelAndView edit(User edituser,HttpSession session){
		ModelAndView mav=new ModelAndView();
		blogService.updateUser(edituser);
		mav.addObject("message", "删除成功!");
		mav.addObject("user", session.getAttribute("user"));
		mav.addObject("url", "/blog/userindex.xhb");
		mav.setViewName("success");
		return mav;
	}
	
	@RequestMapping("/userindex")
	public ModelAndView toUserList(HttpSession session,Integer currPage){
		User loginuser = (User) session.getAttribute("user");
		ModelAndView mav=new ModelAndView();
		//List<User> list = blogService.allUser();
		Page<User> page = new Page<User>();
		if(currPage == null){
			page.setCurrPage(1);
		}else{
			page.setCurrPage(currPage);
		}
		page.setTotalCount(blogService.allUser().size());
		page.setTotalPage();
		page.setStart();
		page.setLists(blogService.allUserPage(page));
		
		mav.addObject("user",loginuser);
		mav.addObject("page", page);
		mav.setViewName("user/userlist");
		return mav;
	}
}
