package pro.jing.bean.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import pro.jing.bean.di.xml.IService;

public class BeanRelatationTest {

	private ApplicationContext ctx;

	@Before
	public void setUp() {
		ctx = new ClassPathXmlApplicationContext("beanRelatation.xml");
	}

	// @Test
	public void parentTest() {

		IService service01 = (IService) ctx.getBean("service01");
		Assert.notNull(service01);
		service01.add();

		IService service02 = (IService) ctx.getBean("service02");
		Assert.notNull(service02);
		service02.add();
	}

	@Test
	public void dependsOnTest() {
		IService service03 = (IService) ctx.getBean("service03");
		Assert.notNull(service03);
		service03.add();
	}
}
