package com.luv2code.SrpingAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BasketBallCoach implements Coach {

	private DailyFortuneService dailyFortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice your dribble 1 hour each day";
	}

	@Override
	public String getFortune() {
		return dailyFortuneService.getFortune();
	}

//	@Autowired
//	public void setDailyFortuneService(DailyFortuneService dailyFortuneService) {
//		this.dailyFortuneService = dailyFortuneService;
//	}
	@Autowired
	public void methodInjection(DailyFortuneService dailyFortuneService) {
	this.dailyFortuneService = dailyFortuneService;
}
	
	

}
