package pro.jing.bean.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pro.jing.bean.di.xml.IService;

public class BeanPropertyTest {
	private ApplicationContext ctx;

	@Before
	public void setUp() {
		ctx = new ClassPathXmlApplicationContext("beanProperties.xml");
	}
	
	@Test
	public void propertySettingTest() {
		IService service01 = (IService) ctx.getBean("service01");
		service01.add();
	}
}
