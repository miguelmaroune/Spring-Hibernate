package com.luv2code.SrpingAnnotations;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService happyFortuneService) {

		this.fortuneService = happyFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Hit the pool twice a day ! ";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
