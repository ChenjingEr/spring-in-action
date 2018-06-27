package pro.jing.bean.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pro.jing.bean.di.annotation.IRespority;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beanAnnotation.xml")
public class BeanAnnotationConfigTest {
	
	@Autowired 
	private IRespority respority;
	
	@Test
	public void annotationTest() {
		respority.add();
	}
}
