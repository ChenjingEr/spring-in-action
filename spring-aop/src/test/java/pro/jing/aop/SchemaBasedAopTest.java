package pro.jing.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pro.jing.aop.schema_based.IncorrigiblyObstinate;
import pro.jing.aop.schema_based.IncorrigiblyObstinateImpl;

public class SchemaBasedAopTest {

	@Test
	public void timerAspectTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml"); 
		IncorrigiblyObstinate io = ctx.getBean("incorrigiblyObstinate", IncorrigiblyObstinate.class);
		io.obstinateMind();
		
	}
}
