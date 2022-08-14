package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

public class Practice7Coach implements Coach {
	
	private FortuneService fortuneService;

	public Practice7Coach(FortuneService inputFortuneService) {
		System.out.println("Construstor from Practice7Coach");
		fortuneService = inputFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "getDailyWorkout()";
	}

	@Override
	public String getDailyFortune() {
		
		return "getDailyFortune()";
	}

}
