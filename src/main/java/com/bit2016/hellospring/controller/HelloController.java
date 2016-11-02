package com.bit2016.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "/WEB-INF/views/hello.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/hello2")
	public String hello2() {
		return "hello2";
	}
	
	@RequestMapping("/hello3")
	public ModelAndView hello3(@RequestParam("name") String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name);
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
}
