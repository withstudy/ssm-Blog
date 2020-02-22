package com.blog.controller;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.model.User;
import com.blog.service.CommentService;
import com.blog.service.UserService;
import com.blog.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	@Qualifier("userValidator")
	private UserValidator userValidator;
	
	
	@Autowired
	private UserService userService;
	
	
	
	//��¼ҳ��
	@RequestMapping("/userlogin")
	public String loginForm(Model model){
		User user = new User();
		model.addAttribute("user",user);
		return "login";
	}
	@RequestMapping("/toregister")
	public String toregister(Model model){
		User user = new User();
		model.addAttribute("user",user);
		return "register";
	}
	
	
	//��¼��֤
	@RequestMapping("/login")
	public String login(User user,Errors errors,Model model,HttpSession session){
		
		userValidator.validate(user, errors);
		if(errors.hasErrors()){
			return "login";
		}
//		if(user.getRepassword() != user.getPassword()){
//			errors.rejectValue("login", "login.too.repassword","�������벻һ��");			
//			return "login";
//		}
		if(userService.login(user)){
			session.setAttribute("user", user);
			return "redirect:/blog/index.xhb";
		}else{
			errors.rejectValue("login", "login.too.error","�û������������");			
			return "login";
		}
		
	}
	@RequestMapping("/register")
	public String register(User user,Errors errors,Model model,HttpSession session){
		
		userValidator.validate(user, errors);
		if(errors.hasErrors()){
			return "register";
		}
		if(user.getRepassword() == null){
			errors.rejectValue("repassword", "repassword.too.null","���벻��Ϊ��");			
			return "register";
		}
		if(!user.getRepassword().equals(user.getPassword())){
			errors.rejectValue("repassword", "repassword.too.repassword","�������벻һ��");			
			return "register";
		}
		if(userService.register(user) != null){
			errors.rejectValue("username", "username.too.error","���û��Ѵ���");	
			return "register";
		}else{
			userService.add(user);
			return "redirect:/user/userlogin.xhb";
		}
		
	}
	
	
	//�˳�
	@RequestMapping("/exit")
	public String exit(Model model,HttpSession session){
		User user = new User();
		model.addAttribute("user",user);
		session.removeAttribute("user");
		return "redirect:/user/userlogin.xhb";
	}
	
}
