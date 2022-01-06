package com.luv2code.springdemo;

public class FootballCoach implements Coach{

	
	private FortuneService fortuneService ;
	
	public FootballCoach (FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {

		return "Do 20 Drible excercies Per day";
	}

	@Override
	public String getDailyFortune() {

		return "Just Do IT !!!!! "+fortuneService.getFortune();
	}
	

}
