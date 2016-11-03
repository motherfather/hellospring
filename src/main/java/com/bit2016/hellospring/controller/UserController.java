package com.bit2016.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// requestmapping (type + method)
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/joinform")
	public String joinForm() {
		return "/WEB-INF/views/joinform.jsp";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(@ModelAttribute UserVo vo) {
		System.out.println(vo);
		return "redirect:/user/joinsuccess"; // + request.getContextPath();
	}
	
	@RequestMapping("/joinsuccess")
	@ResponseBody
	public String joinSuccess() {
		return "joinSuccess";
	}
}
