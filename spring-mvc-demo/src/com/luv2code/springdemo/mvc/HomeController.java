package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//this annotation is used to map this method to the url request
	//"/" means the root so when entering the application we will redirected to this function
	@RequestMapping("/")
	public String showPage() 
	{
//		Spring will use the spring-mvc-demo-servlet.xml and add
//		the prefix (/WEB-INF/view/) and suffix(.jsp) to this name 
		return "main-menu";
	}

}
