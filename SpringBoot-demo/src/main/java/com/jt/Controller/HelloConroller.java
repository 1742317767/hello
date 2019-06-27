package com.jt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloConroller {

	@RequestMapping("/hello")
	@ResponseBody
	public String Hello() {
		
		
		return "Hello";
	}
	
	
	
}
