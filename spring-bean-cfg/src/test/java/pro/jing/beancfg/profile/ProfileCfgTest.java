package pro.jing.beancfg.profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:profile.xml")
@ActiveProfiles("prod")
public class ProfileCfgTest {

	@Autowired
	private EnvironmentSelection es;

	@Test
	public void profileCofTest() {
		es.printEnv();
	}
}
