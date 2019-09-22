package com.kr.uv.configuration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kr.uv.configuration.service.GreetInEnglish;
import com.kr.uv.configuration.service.GreetingService;

@Configuration
public class GreetBeanConfig
{
	@Bean
	public GreetingService eBean()
	{
		System.out.println("Configuration From bean provider new");
		return new GreetInEnglish();
	}
}
