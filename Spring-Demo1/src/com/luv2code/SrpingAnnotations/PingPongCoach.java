package com.luv2code.SrpingAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
//@Scope("prototype")
public class PingPongCoach implements Coach {

	//if you have multiple implementation for an interface we use Qualifier to specify which one 
	@Autowired
	@Qualifier("dailyFortuneService")
	private FortuneService dailyFortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand ";
	}

	@Override
	public String getFortune() {
		return dailyFortuneService.getFortune();
	}
	
	@PostConstruct
	public void init() 
	{
		System.out.println("On bean init using Annotation");
	}
	
	@PreDestroy
	public void destroy() 
	{
		System.out.println("At bean destroy ! ");
	}

}
