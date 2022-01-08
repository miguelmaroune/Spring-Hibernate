package com.luv2code.SrpingAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//if we dont specify the bean id the default will be tennisCoach
@Component("tennisCoach")
public class TennisCoach implements Coach{

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("fileFortuneService")FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley!";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	
}
