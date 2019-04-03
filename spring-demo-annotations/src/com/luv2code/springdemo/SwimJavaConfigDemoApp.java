package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read Spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(myConfig.class);
		//get the bean from the Spring container
		Coach theCoach = context.getBean("rugbyCoach", Coach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();
	}

}
