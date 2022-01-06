package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	private FortuneService fortuneService;
	
	public CricketCoach () 
	{
		System.out.println("Inside Cricket Coach default Constrc");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mins a day "+team;
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
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
}
