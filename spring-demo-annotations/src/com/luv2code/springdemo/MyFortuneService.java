package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFortuneService implements FortuneService {
	private String filename = "C:/Users/Eimantas/Desktop/fortune-data.txt";
	private List<String> myFortunes;
	
	private Random myRandom = new Random();
	
	@PostConstruct
	public void loadData() {
		System.out.println("Inside PostConstruct");
File theFile = new File(filename);
		
		myFortunes = new ArrayList<String>();
	
	try (BufferedReader br = new BufferedReader(
			new FileReader(theFile))) {

		String tempLine;

		while ((tempLine = br.readLine()) != null) {
			myFortunes.add(tempLine);
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

	
	public String getFortune() {
		int thisRandom = myRandom.nextInt(5);
		return myFortunes.get(thisRandom);
	}


}
