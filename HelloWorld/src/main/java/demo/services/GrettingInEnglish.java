package demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default","english"})
public class GrettingInEnglish implements GreetingService
{

	@Override
	public String greet()
	{
		return "Hello World, Jay mataji..";
	}

}
