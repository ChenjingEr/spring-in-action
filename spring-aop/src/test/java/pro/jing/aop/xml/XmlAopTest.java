package pro.jing.aop.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pro.jing.aop.aspectj.ISimpleCalculator;

public class XmlAopTest {
	
	@Test
	public void testXmlSechamed() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:aop-xml.xml");
		ISimpleCalculator cal = (ISimpleCalculator) ctx.getBean("cal");
		cal.add(1, 10);
		System.out.println();
	}
}
