package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		
		// retrieve bean from the spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same beans
		
		boolean result = (theCoach == alphaCoach);
		
		//print out result
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location of theCoach: "+ theCoach);
		
		System.out.println("\nMemory location of theCoach: "+ alphaCoach + "\n");
		
		//close the context
		context.close();
	}

}
