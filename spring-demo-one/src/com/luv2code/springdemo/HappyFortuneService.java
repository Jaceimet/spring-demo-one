package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private Random random = new Random();
	
	@Override
	public String getFortune() {
		
		int fortuneNumber = random.nextInt(fortuneArray.length);
		
		return "Todays fortune number is #" +fortuneNumber+ ": "+ fortuneArray[fortuneNumber];
	}

}
