package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String []randomFortune = {"Today will be a great day ! ",
			                          "Diligence is the mother of good luck",
			                          "Beware of the wolf in sheep's clothing",
			                          "The journey is the reward"};
	private Random random = new Random();
	
	@Override
	public String getFortune() {

		int index = random.nextInt(randomFortune.length);
		return randomFortune[index];
	}

}
