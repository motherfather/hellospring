package com.bit2016.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/write")
	public String write(@RequestParam("name") String name, /*추천(값을 빼먹었을때 오류안뜨고 실행되게끔 하는 방법!!!)*/@RequestParam(value="content", required=true, defaultValue="") String content) {
		return "board : " + name + " :: " + content;
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="no", required=true, defaultValue="0") int no) {
		return "board:delete:" + no;
	}
	
	@ResponseBody
	@RequestMapping("/view/{no}")
	public String view(@PathVariable("no") int no) {
		return "board:view:" + no;
	}

}
