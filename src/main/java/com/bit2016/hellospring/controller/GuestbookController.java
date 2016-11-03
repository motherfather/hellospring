package com.bit2016.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// request mapping(type 단독)
@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	@RequestMapping
	@ResponseBody
	public String list() {
		return "guestbook:list";
	}
	
	@RequestMapping
	@ResponseBody
	public String add() {
		return "guestbook:add";
	}
	
	@RequestMapping
	@ResponseBody
	public String delete() {
		return "guestbook:delete";
	}
}
