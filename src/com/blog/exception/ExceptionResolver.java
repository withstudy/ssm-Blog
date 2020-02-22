package com.blog.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.UserException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub
		ModelAndView modelandview = new ModelAndView();
		if(ex instanceof UserException){
			modelandview.addObject("message",ex.getMessage());
			modelandview.setViewName("exception");

		}else{
			modelandview.addObject("message",ex.getMessage());
			modelandview.setViewName("exception");
		}
		return modelandview;
	}
	
}
