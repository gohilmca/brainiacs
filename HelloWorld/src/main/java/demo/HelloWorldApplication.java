package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.controller.GreetingController;

@SpringBootApplication
public class HelloWorldApplication
{
	public static void main(String[] args)
	{
		System.out.println("Switching on");
		ApplicationContext ctx = SpringApplication.run(HelloWorldApplication.class, args);
		GreetingController gc = ctx.getBean(GreetingController.class);
		gc.sayHello();
		System.out.println("Switching off");
		
	}

}
