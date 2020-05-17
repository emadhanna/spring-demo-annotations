package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//Read Spring Config File
		ClassPathXmlApplicationContext theContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the Bean from Spring Container
//		Coach theCoach = theContext.getBean("thatSillyCoach", Coach.class);
		Coach theCoach = theContext.getBean("tennisCoach", Coach.class);
		
		//Call a Method on the Bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Close Spring Context File
		theContext.close();
	}
}
