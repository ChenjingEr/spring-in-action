package pro.jing.bean.xml.instanitiation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pro.jing.bean.instantiation.IRespority;

public class BeanInitanitiationTest {

	private ClassPathXmlApplicationContext ctx;

	@Before
	public void setUp() {
		ctx = new ClassPathXmlApplicationContext("beanInstaniation.xml");
	}
	
	@Test
	public void beanInstantiationTest() {
		IRespority r01 = (IRespority) ctx.getBean("r01");
		r01.add();
		
		IRespority r02 = (IRespority) ctx.getBean("r02");
		r02.add();
		
		IRespority r03 = (IRespority) ctx.getBean("r03");
		r03.add();
		
	}
}
