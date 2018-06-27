package pro.jing.bean.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import pro.jing.bean.di.xml.IService;

public class BeanAutowireTest {

	private ApplicationContext ctx;

	@Before
	public void setUp() {
		ctx = new ClassPathXmlApplicationContext("beanAutowire.xml");
	}
	
	@Test
	public void autowireTest() {
		IService service09 = (IService) ctx.getBean("service09");
		Assert.notNull(service09);
		service09.add();
		
		IService service10 = (IService) ctx.getBean("service10");
		Assert.notNull(service10);
		service10.add();
	}
}
