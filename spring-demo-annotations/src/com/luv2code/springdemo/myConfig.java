package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myConfig {

	
	@Bean
	public FortuneService incredibleFortuneService() {
		return new IncredibleFortuneService();
	}
	
	@Bean
	public Coach rugbyCoach() {
		return new RugbyCoach(incredibleFortuneService());
	}
}
