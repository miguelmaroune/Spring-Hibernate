package com.luv2code.SrpingAnnotations;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class DailyFortuneService implements FortuneService {

	private String[] dailyQuotes = {"Fortune and love favor the brave",
			                        "Fortune favors the brave",
			                        "There is a tide in the affairs of men, Which taken at the flood, leads on to fortune."};
	private Random random = new Random();
	@Override
	public String getFortune() {
		int i = random.nextInt(dailyQuotes.length);
		return dailyQuotes[i];
	}

}
