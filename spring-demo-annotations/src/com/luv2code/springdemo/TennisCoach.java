package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("myFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService thefortuneService) {
//		fortuneService = thefortuneService;
//	}
	public TennisCoach() {
		//System.out.println("Inside default constructor");
	}
//	@Autowired
//	public void cookMeSomeBeans(FortuneService beaner) {
//		System.out.println("Inside setter method");
//		fortuneService = beaner;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	//define init
//	@PostConstruct
//	public void doMyStartUpStuff() {
//		System.out.println("Tennis Coach: inside myStartUpStuff");
//	}
//	@PreDestroy
//	public void doMyCleanUpMyStuff() {
//		System.out.println("Tennis Coach: inside cleanUpStuff");
//	}
	
	//define destroy
	
	
	
	
	
}
