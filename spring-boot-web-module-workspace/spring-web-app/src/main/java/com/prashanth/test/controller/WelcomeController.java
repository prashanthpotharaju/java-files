package com.prashanth.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//indirectly it is a component class object is created by the container
public class WelcomeController {

	//incoming request is mapping to this method
	//1 	METHOD=1 SERVLET
	@RequestMapping("/welcome")
	public ModelAndView getHome()
	{
		System.out.println("This FirstController getHome().........");
		System.out.println("From here i am loading jsp file rto show welcome message");
		
		ModelAndView modelAndView=new ModelAndView();//it's like RequestDispatcher in Servlets
		
		//View Name:Jsp File Name
		modelAndView.setViewName("home");
		
		//Data "Added : Model:Bussiness Data
	
		String messageToUsers="Welcome to SpringBoot Setup........Model Data";
		modelAndView.addObject("message", messageToUsers);
		return modelAndView;
	}
	

	@RequestMapping("/hello")
	//@RequestMapping(value="/hello")--same
	//@RequestMapping(path="/hello")--same
	public ModelAndView getHello()
	{
		
		System.out.println("This FirstController getHello().........");
		System.out.println("From here i am loading jsp file rto show hello message");
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("home");
		
		String helloMessage="Hello Everyone .......";
		modelAndView.addObject("message",helloMessage);
		
		
		return modelAndView;
	}
	
	
}
