package pro.jing.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Config.class)
public class EventTest {

	@Autowired
	private UpdatePublisher publisher;
	
	@Test
	public void testEvent() {
		publisher.publish(new UpdateEvent("update event..."));
	}
}
