package pro.jing.bean.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import pro.jing.bean.di.xml.IRespority;
import pro.jing.bean.di.xml.IService;

public class BeanDiXmlBasedTest {

	private ApplicationContext ctx;

	@Before
	public void setUp() {
		ctx = new ClassPathXmlApplicationContext("beanConfig.xml");
	}

	// @Test
	public void simpleDiTest() {

		IRespority respority = (IRespority) ctx.getBean("respority");
		Assert.notNull(respority);
		respority.add();
	}

//	@Test
	public void constructorInjectTest() {
		// default
		IService service01 = (IService) ctx.getBean("service01");
		Assert.notNull(service01);
		service01.add();
		
		// byIndex
		IService service02 = (IService) ctx.getBean("service02");
		Assert.notNull(service02);
		service02.add();
		
		// byName
		IService service03 = (IService) ctx.getBean("service03");
		Assert.notNull(service03);
		service03.add();

		// byType
		IService service04 = (IService) ctx.getBean("service04");
		Assert.notNull(service04);
		service04.add();
		
		// c tag
		IService service05 = (IService) ctx.getBean("service05");
		Assert.notNull(service05);
		service05.add();
	}
	
	@Test
	public void propertyDiTest() {
		// property ≈‰÷√
		IService service06 = (IService) ctx.getBean("service06");
		Assert.notNull(service06);
		service06.add();
		
		//p tag
		IService service07 = (IService) ctx.getBean("service07");
		Assert.notNull(service07);
		service07.add();
		
		//ƒ⁄≤ø¿‡
		IService service08 = (IService) ctx.getBean("service08");
		Assert.notNull(service08);
		service08.add();
	}
}
