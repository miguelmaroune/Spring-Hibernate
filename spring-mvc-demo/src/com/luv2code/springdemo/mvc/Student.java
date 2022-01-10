package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
@Component
public class Student {

	private String firstName ;
	private String lastName;
	private String country ;
	private String favoriteLanguage;
	private LinkedHashMap<String,String> favoriteLanguages;
	private String [] operatingSystems ;
//	private LinkedHashMap<String,String> countryOptions;
	
	@PostConstruct
	public void init() 
	{
		System.out.println("On bean creation");
	}
	
	public Student() 
	{
		//populate country options : used ISO country code 
//		countryOptions = new LinkedHashMap<>();
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("FR", "France");
//		countryOptions.put("DE", "Germany");
//		countryOptions.put("IN", "India");
		favoriteLanguages = new LinkedHashMap<>();
		favoriteLanguages.put("Java", "Java");
		favoriteLanguages.put("C#", "C#");
		favoriteLanguages.put("PHP", "PHP");
		favoriteLanguages.put("Ruby", "Ruby");
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public void setFavoriteLanguages(LinkedHashMap<String, String> favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

//	public LinkedHashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}
	
	
}
