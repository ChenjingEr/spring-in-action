package pro.jing.beancfg.initanitiating;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pro.jing.beancfg.instantiating.Phone;

public class InitanitiatTest {

	@Test
	public void initanitiatTest() {
		BeanFactory bf = new ClassPathXmlApplicationContext("instanitiation.xml");
		Phone phone01 = bf.getBean("phoneByStaticFactory", Phone.class);
		Assert.assertNotNull(phone01);

		Phone phone02 = bf.getBean("phoneByFactory", Phone.class);
		Assert.assertNotNull(phone02);
	}
}
