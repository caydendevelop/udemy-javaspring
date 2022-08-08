package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"sentence 1",
			"sentence 2",
			"sentence 3"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		
		//picker a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
