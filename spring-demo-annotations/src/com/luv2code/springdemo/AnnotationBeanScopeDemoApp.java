package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
//		System.out.println("Are they the same? " + result);
//		System.out.println("\nMemory location for theCoach:" + theCoach);
//		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
