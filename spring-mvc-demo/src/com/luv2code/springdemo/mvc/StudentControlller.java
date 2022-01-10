package com.luv2code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentControlller {

	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) 
	{
		//create a new student object 
		Student theStudent = new Student();
		//add student object to the model this way we can 
		//reference 'student' from the spring form tags	
		theModel.addAttribute("student",theStudent);
		
		// add the country options to the model 
	    theModel.addAttribute("theCountryOptions", countryOptions); 
		
		return "student-form";
	}
	
	//ModelAttribute is used for data binding , to get the student object from the form
	// and directly map it to theStudent.
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) 
	{
		//log the input data
		System.out.println("First Name : "+theStudent.getFirstName());
		
		return "student-confirmation";
	}
	
	
}
