package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	// create random number generator
	
	private Random random = new Random();
	
	// create an array of string
	
	private String[] fortuneArray = {
		"Today is the day", "the sun will come out tomorrow", "the end is near"
	};
	
	@Override
	public String getFortune() {
		// pick random string from array
		int randomNumber = random.nextInt(fortuneArray.length);
		
		return fortuneArray[randomNumber];
	}
	
	

}
