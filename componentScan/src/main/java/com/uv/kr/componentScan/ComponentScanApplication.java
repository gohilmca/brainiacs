package com.uv.kr.componentScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import controller.GreetingController;

@SpringBootApplication
@ComponentScan({"services","controller"})
public class ComponentScanApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(ComponentScanApplication.class, args);
		GreetingController gc = cxt.getBean(GreetingController.class);
		gc.sayHello();
	}

}
