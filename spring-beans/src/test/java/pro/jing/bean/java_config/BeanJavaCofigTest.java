package pro.jing.bean.java_config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pro.jing.bean.di.java_config.Config;
import pro.jing.bean.di.java_config.IService;


public class BeanJavaCofigTest {

	@Test
	public void javaConfigTest() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        IService service = (IService) ctx.getBean("service");
        service.add();

	}
}
