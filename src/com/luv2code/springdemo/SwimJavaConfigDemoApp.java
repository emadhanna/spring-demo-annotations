package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//Read Spring Java Configuration Class
		AnnotationConfigApplicationContext theContext = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Get the Bean from Spring Container
        //Coach theCoach = theContext.getBean("thatSillyCoach", Coach.class);
		SwimCoach theCoach = theContext.getBean("swimCoach", SwimCoach.class);
		
		//Call a Method on the Bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Call Method to get the Daily Fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Call Method to get email address
		System.out.println("Email: " + theCoach.getEmail());
		
		//Call Method to get email address
		System.out.println("Team: " + theCoach.getTeam());
		
		//Close Spring Context File
		theContext.close();
	}
}
