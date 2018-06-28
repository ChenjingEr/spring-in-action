package pro.jing.transaction;

import javax.management.InstanceAlreadyExistsException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pro.jing.transaction.service.IArithmeticService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ArithmeticServiceTest {

	@Autowired
	private IArithmeticService arithmeticService;
	
	@Test
	public void testArithmeticDiv() {
		try {
			arithmeticService.div(10, 0);
		} catch (ArithmeticExecpetion e) {
			System.out.println(e.getMessage());
		}
	}
}
