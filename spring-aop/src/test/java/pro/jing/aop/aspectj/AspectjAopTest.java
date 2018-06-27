package pro.jing.aop.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:aop-aspectj.xml")
public class AspectjAopTest {
	
	@Autowired 
	private ISimpleCalculator cal;

	@Test
	public void aspectjTest() {
		cal.add(1, 10);
		cal.sub(10, 0);
		cal.div(10, 0);
	}
}
