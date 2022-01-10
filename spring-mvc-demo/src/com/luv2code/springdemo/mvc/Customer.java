package com.luv2code.springdemo.mvc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public class Customer {

	private String firstName ; 
	@NotNull(message="is required")
	@Size(min = 2, message="is required")	
	private String lastName ;
	
	public Customer() 
	{
		
	}
	
	//@InitBinder will pre-process every web request
	//Pre-process every String form data
	//Remove leading and trailing white space
	//If String only has white space ... trim it to null
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) 
	{
		//the constructor takes true so if its all white space make it null
		StringTrimmerEditor strinTrimmerEditor  = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, strinTrimmerEditor);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
