package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class NewCoach implements Coach {

	@Override
	public String getDailyWorkout() {	
		return "This is New Coach";
	}

	@Override
	public String getDailyFortune() {
		return "";
	}
}
