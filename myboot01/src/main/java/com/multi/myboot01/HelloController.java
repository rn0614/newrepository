package com.multi.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@ResponseBody				// 결과를 view 페이지를 통하지 않고 반환값을 HTTP Response Body에 직접 전속
	@RequestMapping("/") 	//  요청 url 
	public String home() {
		System.out.println("Hello Boost!!");
		return "hello Boot";
	}
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message","안녕하세요");
		return "hello";
	}
	
}
