package pro.jing.di;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pro.jing.di.cfg.javaconfig_based.HelloApi;
import pro.jing.di.cfg.javaconfig_based.HelloConfig;
import pro.jing.di.cfg.javaconfig_based.HelloImpl;
import pro.jing.di.cfg.javaconfig_based.HelloImpl2;

public class JavaConfigBasedTest {

	@Test
	public void helloConfigTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        HelloApi hello = context.getBean("hello",HelloImpl.class);
        Assert.assertNotNull(hello);
        hello.say("hi");
	}
	
	@Test
	public void helloConfigDiTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        HelloApi hello = context.getBean("hello02",HelloImpl2.class);
        Assert.assertNotNull(hello);
        hello.say("hi");
	}
}
