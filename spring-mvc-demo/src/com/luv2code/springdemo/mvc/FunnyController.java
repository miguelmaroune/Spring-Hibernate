package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Funny")
public class FunnyController {

	@RequestMapping("/showForm")
	public String displayTheForm() 
	{
		return "Funny";
	}
}
