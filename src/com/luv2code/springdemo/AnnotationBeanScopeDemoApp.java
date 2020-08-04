package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Load Spring Config File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//Check if they are the same
		Boolean result = (theCoach == alphaCoach);
		
		//Print out the results
		System.out.println("\nProinting to the same object: " + result);
		System.out.println("\nMemory Location of theCoach: " + theCoach);
		System.out.println("\nMemory Location of alphaCoach: " + alphaCoach);
		
		//Close the context
		context.close();

	}

}
