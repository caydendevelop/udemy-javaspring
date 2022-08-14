package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Practice7Config {
	
	@Bean
	public FortuneService practice7FortuneService () {
		return new Practice7FortuneService() ;
	}
	
	@Bean
	public Coach practice7Coach() {
		return new Practice7Coach(practice7FortuneService());
	}

}
