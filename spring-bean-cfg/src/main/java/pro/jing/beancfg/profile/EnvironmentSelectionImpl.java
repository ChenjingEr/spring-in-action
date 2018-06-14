package pro.jing.beancfg.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentSelectionImpl implements EnvironmentSelection{
	
	@Value("${cfg}")
	private String env;

	@Override
	public void printEnv() {
		System.out.println(env);
	}

}
