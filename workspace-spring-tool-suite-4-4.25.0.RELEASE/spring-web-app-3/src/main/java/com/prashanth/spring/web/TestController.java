package com.prashanth.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/home")
	public  String getHome()
	{
		
		return "home";
	}
}
