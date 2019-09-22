package com.kr.uv.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.kr.uv.configuration.controller.GreetingController;


@SpringBootApplication
public class SpringConfigurationApplication {

	public static void main(String[] args) {
		System.out.println("hi");
		ApplicationContext ctx = SpringApplication.run(SpringConfigurationApplication.class, args);
		GreetingController gc = ctx.getBean(GreetingController.class);
		gc.sayGreet();
		System.out.println("helo");
	}

}
