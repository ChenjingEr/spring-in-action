package pro.jing.bean.xml.cycle;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pro.jing.bean.cycle.IRespority;

public class BeanCycleTest {
	private ClassPathXmlApplicationContext ctx;

	@Before
	public void setUp() {
		ctx = new ClassPathXmlApplicationContext("beanCycle.xml");
	}
	
	@Test
	public void testInsetaniation() {
		IRespority respority = (IRespority) ctx.getBean("respority01");
		respority.add();
		ctx.close();
	}
}
