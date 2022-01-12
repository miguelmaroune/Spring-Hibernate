package com.luv2code.SrpingAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.SrpingAnnotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneService happyFortuneService() 
	{
		return new DailyFortuneService();
	}
	
	@Bean
	public Coach swimCoach() 
	{
		SwimCoach mySwimCoach = new SwimCoach(happyFortuneService());
		
		return mySwimCoach;
	}

}
