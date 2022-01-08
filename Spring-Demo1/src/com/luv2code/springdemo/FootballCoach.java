package com.luv2code.springdemo;

public class FootballCoach implements Coach{

	public static int instanceCount = 0 ;
	private FortuneService fortuneService ;
	
	public FootballCoach (FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
		instanceCount ++;	
	}
	
	public void init() 
	{
		System.out.println("FootballCoach : inside init ! ");
	}
	
	public void destroy() 
	{
		System.out.println("FootballCoach : inside destroy ! ");	
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
