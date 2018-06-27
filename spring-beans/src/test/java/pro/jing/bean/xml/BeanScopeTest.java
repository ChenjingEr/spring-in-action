package pro.jing.bean.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import pro.jing.bean.di.xml.IService;

public class BeanScopeTest {

	private ApplicationContext ctx;

	@Before
	public void setUp() {
		ctx = new ClassPathXmlApplicationContext("beanScope.xml");
	}

	@Test
	public void scopeTest() {

		IService service01 = (IService) ctx.getBean("service01");
		Assert.notNull(service01);
		
		IService service011 = (IService) ctx.getBean("service01");
		Assert.notNull(service01);
		System.out.println(service01 == service011);

		IService service02 = (IService) ctx.getBean("service02");
		Assert.notNull(service02);

		IService service021 = (IService) ctx.getBean("service02");
		System.out.println(service02 == service021);
	}

}
