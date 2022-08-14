package com.luv2code.springdemo;


import org.springframework.stereotype.Component;

public class Practice7FortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is Practice7FortuneService.getFortune()";
	}

}
