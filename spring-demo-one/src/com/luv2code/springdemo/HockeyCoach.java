package com.luv2code.springdemo;

public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HockeyCoach() {
		
	}
	
	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Do 20 sprint drills";
	}

	@Override
	public String getDailyFortune() {

		return "Lets Begin: " + fortuneService.getFortune();
	}

}
