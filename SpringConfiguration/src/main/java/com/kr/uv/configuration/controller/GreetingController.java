package com.kr.uv.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kr.uv.configuration.service.GreetingService;

@Component
public class GreetingController {

	GreetingService gs;
	
	
	public GreetingService getGs() {
		return gs;
	}

	@Autowired
	public void setGs(GreetingService gs) {
		System.out.println("Setter worked as well...");
		this.gs = gs;
	}

	public void sayGreet() {
		System.out.println("Your great for today is :- "+gs.greet());
	}

}
