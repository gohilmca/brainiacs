package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import demo.services.GreetingService;

@Controller
public class GreetingController
{
	GreetingService greetingService;

	@Autowired
	public GreetingController(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
	
	public void sayHello()
	{
		System.out.println("I am called to greet -> "+ greetingService.greet());
	}
}
