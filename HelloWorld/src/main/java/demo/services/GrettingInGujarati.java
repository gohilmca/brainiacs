package demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("gujarati")
public class GrettingInGujarati implements GreetingService
{

	@Override
	public String greet()
	{
		return "નમસ્તે, તમે કેમ છો, જય માતાજી";
	}

}
