package pro.jing.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class UpdatePublisher {
	
	@Autowired
	private ApplicationContext context;
	
	public void publish(UpdateEvent event) {
		System.out.println("update start...");
        context.publishEvent(event);
    }

}
