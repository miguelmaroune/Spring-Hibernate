package com.luv2code.SrpingAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

//		read the spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
//		get the bean from spring container
		
		Coach theCoach  = context.getBean("tennisCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		
		Coach basketBallCoach  = context.getBean("pingPongCoach",Coach.class);
		System.out.println("\n\n\n\n"+basketBallCoach.getDailyWorkout());
		System.out.println(basketBallCoach.getFortune());
		
		
		Coach swimCoach  = context.getBean("swimCoach",Coach.class);
		System.out.println("\n\n\n\n"+swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getFortune());
//		close the context.
		context.close();
	}

}
