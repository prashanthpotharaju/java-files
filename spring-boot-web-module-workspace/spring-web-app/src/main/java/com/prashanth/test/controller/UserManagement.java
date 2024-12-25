package com.prashanth.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prashanth.test.service.UserManagementService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserManagement {
	
	@Autowired
	UserManagementService userManagementService;
	
	public UserManagement()
	{
		System.out.println("Controller identified  and instance is created");
	}
	

	@RequestMapping("/register")
	public String loadUserRegisterFrom()
	{
		System.out.println("loadUserRegisterForm()........");
		return "UserRegister";//configure the jsp file name ,which has to be load
	}
	
	@RequestMapping(path="user/register" , method= RequestMethod.POST)
	public ModelAndView registerUser(HttpServletRequest request)
	{
		//logic for reading data from the request
		String name=request.getParameter("fullName");
		String email=request.getParameter("email");
		String pwd=request.getParameter("password");
		String mobile=request.getParameter("contact");
		//TODO IN SERVICE LAYER INSERTING INTO DB TABLE
		
		ModelAndView modelAndView =new ModelAndView();
		
		String response=userManagementService.createUser(name, email, pwd, mobile);
		modelAndView.setViewName("result");
		modelAndView.addObject("afterRegister",response+":"+email);
		
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(pwd);
		System.out.println(mobile);
		
		//ModelAndView modelAndView =new ModelAndView();
		//modelAndView.setViewName("result");
		//modelAndView.addObject("afterRegister", "User Registered Successfully for :"+email);
		
		
		return modelAndView;
	}
	
	@RequestMapping("/login")
	public String loadLoginForm()
	{
		System.out.println("Loginform loaded.....");
		return "UserLogin";
	}
	
	@RequestMapping(path="user/login",method=RequestMethod.GET)
	public ModelAndView loginUser(HttpServletRequest request)
	{
		String email=request.getParameter("email");
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("result");
		
		String response=userManagementService.getUser(email);
		modelAndView.addObject("afterLogin", response+":"+email);
		
		return modelAndView;
	}
	
}
