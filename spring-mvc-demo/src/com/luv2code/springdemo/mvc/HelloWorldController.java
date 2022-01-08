package com.luv2code.springdemo.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() 
	{
		return "helloWorld-form";
	}
	
	
	//need a controller method to process the HTML form 
	@RequestMapping("/processForm")
	public String processForm() 
	{
		return "helloWorld";
	}
	
	
	//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request , Model model) 
	{
		//read the request params from the html form
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String result = "Yo ! "+name;
		
		model.addAttribute("message",result);
		
		return "helloWorld";
	}
	
}
