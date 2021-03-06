package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file 
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve a bean from the spring container.
		Coach theCoach = context.getBean("myCoach",Coach.class);
		CricketCoach theCricketCoach = context.getBean("myCricketCoach",CricketCoach.class);   
				
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//close the context.
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getDailyFortune());
		System.out.println("The email address : "+theCricketCoach.getEmailAddress());
		
		context.close();
		
	}

}
