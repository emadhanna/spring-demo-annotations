package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//Read Spring Configuration File
		ClassPathXmlApplicationContext theContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the Bean from Spring Container
//		Coach theCoach = theContext.getBean("thatSillyCoach", Coach.class);
		TennisCoach theCoach = theContext.getBean("tennisCoach", TennisCoach.class);
		
		//Call a Method on the Bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Call Method to get the Daily Fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Call Method to get email address
		System.out.println(theCoach.getEmail());
		
		//Call Method to get email address
		System.out.println(theCoach.getTeam());
		
		//Close Spring Context File
		theContext.close();
	}
}
