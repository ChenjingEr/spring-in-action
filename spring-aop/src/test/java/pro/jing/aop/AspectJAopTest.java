package pro.jing.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pro.jing.aop.aspectj_based.InfinitePossibility;

public class AspectJAopTest {
	
	@Test
	public void aspectJTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-aspect.xml"); 
		InfinitePossibility ib = ctx.getBean("infinitePossibility", InfinitePossibility.class);
		ib.infinitePossibility();
		ib.infinite("Jing", " haha...");
	}

}
