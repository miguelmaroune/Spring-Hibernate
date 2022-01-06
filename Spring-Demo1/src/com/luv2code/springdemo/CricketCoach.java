package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach () 
	{
		System.out.println("Inside Cricket Coach default Constrc");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mins a day ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	public void  setFortuneService (FortuneService fortuneService) 
	{
		System.out.println("inside setFortuneService ");
		this.fortuneService = fortuneService;
	}
}
