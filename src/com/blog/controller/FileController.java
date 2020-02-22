package com.blog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.blog.model.User;
import com.blog.uitls.UploadUtils;

@Controller
@RequestMapping("/file")
public class FileController {

	@RequestMapping("/index")
		public String file(Model model,HttpSession session) {
			User user = (User) session.getAttribute("user");
			model.addAttribute("user",user);
			return "file";
		}

	@RequestMapping("/upload")
	public ModelAndView upload(MultipartFile imgpic,HttpSession session) {
			String upload = UploadUtils.upload(imgpic);

			ModelAndView mav=new ModelAndView();
			
			if(!upload.equals("true")){
				mav.addObject("message", "上传成功!");
				mav.addObject("user", session.getAttribute("user"));
				mav.addObject("url", "/blog/index.xhb");
				mav.setViewName("success");
			}else{
				mav.addObject("message", "上传失败!");
				mav.addObject("user", session.getAttribute("user"));
				mav.setViewName("error");
			}
			
			return mav;
	}

}
