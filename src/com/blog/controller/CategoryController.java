package com.blog.controller;

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
import com.blog.model.Page;
import com.blog.model.User;
import com.blog.service.BlogService;
import com.blog.service.CategoryService;
import com.blog.service.UserService;
import com.blog.validator.UserValidator;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/categoryindex")
	public ModelAndView toUserList(HttpSession session,Integer currPage){
		User loginuser = (User) session.getAttribute("user");
		ModelAndView mav=new ModelAndView();
		//List<User> list = blogService.allUser();
		Page<Category> page = new Page<Category>();
		if(currPage == null){
			page.setCurrPage(1);
		}else{
			page.setCurrPage(currPage);
		}
		page.setTotalCount(categoryService.allCategory().size());
		page.setTotalPage();
		page.setStart();
		page.setLists(categoryService.allCategoryPage(page));
		
		mav.addObject("user",loginuser);
		mav.addObject("page", page);
		mav.setViewName("category/index");
		return mav;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam(value="id",required=false)Integer delid,HttpSession session){
		ModelAndView mav=new ModelAndView();
		categoryService.deleteCategory(delid);
		mav.addObject("message", "删除成功!");
		mav.addObject("user", session.getAttribute("user"));
		mav.addObject("url", "/category/categoryindex.xhb");
		mav.setViewName("success");
		return mav;
	}
	
	@RequestMapping("/toedit")
	public ModelAndView toEdit(@RequestParam(value="id",required=false)Integer editid,HttpSession session){
		ModelAndView mav=new ModelAndView();
		Category category = categoryService.findCategory(editid);
		mav.addObject("editcategory",category);
		mav.setViewName("category/edit");
		mav.addObject("user", session.getAttribute("user"));
		return mav;
	}
	@RequestMapping("/edit")
	public ModelAndView edit(Category editcategory,HttpSession session){
		ModelAndView mav=new ModelAndView();
		categoryService.updateCategory(editcategory);
		mav.addObject("message", "删除成功!");
		mav.addObject("user", session.getAttribute("user"));
		mav.addObject("url", "/category/categoryindex.xhb");
		mav.setViewName("success");
		return mav;
	}
	
	@RequestMapping("/toadd")
	public ModelAndView toAdd(HttpSession session){
		ModelAndView mav=new ModelAndView();
		mav.setViewName("category/add");
		mav.addObject("user", session.getAttribute("user"));
		return mav;
	}
	@RequestMapping("/add")
	public ModelAndView add(Category addcategory,HttpSession session){
		ModelAndView mav=new ModelAndView();
		categoryService.addCategory(addcategory);
		
		mav.addObject("message", "添加成功!");
		mav.addObject("user", session.getAttribute("user"));
		mav.addObject("url", "/category/categoryindex.xhb");
		mav.setViewName("success");
		return mav;
	}
	
	
	
}
