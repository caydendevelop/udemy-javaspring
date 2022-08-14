package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Practice7App {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Practice7Config.class);
		
		// get the bean from spring container
		Practice7Coach theCoach = context.getBean("practice7Coach", Practice7Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();
	}

}
