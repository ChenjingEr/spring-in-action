package pro.jing.beancfg.scope;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=ScopeConfig.class)
public class ScopeTest {

//	@Test
	public void annotationBasedScopeTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class); 
		BeanScope s1 = context.getBean(BeanScope.class);
		BeanScope s2 = context.getBean(BeanScope.class);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);

	}
	
	@Test
	public void xmlBasedScopeTest() {
	
		BeanFactory bf = new ClassPathXmlApplicationContext("scope.xml");
		BeanScopeXmlBased s1 = bf.getBean("scopeCfg", BeanScopeXmlBased.class);
		BeanScopeXmlBased s2 = bf.getBean("scopeCfg", BeanScopeXmlBased.class);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
	}
	
}
