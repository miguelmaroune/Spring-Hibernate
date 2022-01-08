package com.luv2code.SrpingAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

//		read the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
//		get the bean from spring container
		
		Coach theCoach  = context.getBean("tennisCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		
		Coach basketBallCoach  = context.getBean("pingPongCoach",Coach.class);
		System.out.println("\n\n\n\n"+basketBallCoach.getDailyWorkout());
		System.out.println(basketBallCoach.getFortune());
//		close the context.
		context.close();
	}

}
