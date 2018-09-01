package pro.jing.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UpdateListener implements ApplicationListener<UpdateEvent>{

	@Override
	public void onApplicationEvent(UpdateEvent event) {
		System.out.println("UpdateListener get update...");
	}

}
