package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {

	private FortuneService myFortune;
	
	public RugbyCoach(FortuneService fortune) {
		myFortune = fortune;
	}
	@Override
	public String getDailyWorkout() {
		return "run 3 laps around the stadium";
	}

	@Override
	public String getDailyFortune() {
		return myFortune.getFortune();
	}

}
