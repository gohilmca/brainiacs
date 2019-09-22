package services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("hindi")
public class GrettingInHindi implements GreetingService
{

	@Override
	public String greet()
	{
		return "नमस्ते, जय माताजी";
	}

}
