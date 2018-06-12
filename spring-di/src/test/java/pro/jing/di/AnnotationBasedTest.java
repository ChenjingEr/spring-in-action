package pro.jing.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pro.jing.di.cfg.annotation_based.WelcomeApi;
import pro.jing.di.cfg.annotation_based.WelcomeConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=WelcomeConfig.class)
public class AnnotationBasedTest {

	@Autowired
	private WelcomeApi welcome;
	
	@Test
	public void annotationTest() {
		welcome.welcome();
	}
}
