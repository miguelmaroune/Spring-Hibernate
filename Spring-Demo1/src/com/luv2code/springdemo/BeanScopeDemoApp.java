package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

//		load the spring configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
//		retrieve bean from the spring container 
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alfaCoach = context.getBean("myCoach",Coach.class);

//		Check if they are the same by object reference
		boolean result = (theCoach == alfaCoach);
		
		System.out.println("the beans are pointing to the same object ? "+result);
		System.out.println(" memory location for theCoach "+theCoach);
		System.out.println(" memory location for theCoach "+alfaCoach);
		
	
//	close the context
		context.close();
	}

}
