package com.kr.uv.configuration.service;

import org.springframework.stereotype.Component;

public class GreetInEnglish implements GreetingService {

	@Override
	public String greet() {
		return "Hello world, jay mataji";
	}

}
