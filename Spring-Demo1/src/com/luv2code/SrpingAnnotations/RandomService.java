package com.luv2code.SrpingAnnotations;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		return "Random Fortune Service ! ";
	}

}
