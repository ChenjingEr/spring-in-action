package pro.jing.bean.xml;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pro.jing.bean.di.xml.collection.ArrayDi;
import pro.jing.bean.di.xml.collection.ListDi;
import pro.jing.bean.di.xml.collection.MapDi;
import pro.jing.bean.di.xml.collection.SetDi;


public class BeanCollectionDiTest {
	
	private ApplicationContext ctx;

	@Before
	public void setUp() {
		ctx = new ClassPathXmlApplicationContext("collectionDi.xml");
	}
	
	@Test
	public void collectionDiTest() {
		ListDi listDi = ctx.getBean("listDi", ListDi.class);
		Assert.assertNotNull(listDi);
		listDi.printOut();
		
		SetDi setDi = ctx.getBean("setDi", SetDi.class);
		Assert.assertNotNull(setDi);
		setDi.printOut();
		
		ArrayDi arrayDi = ctx.getBean("arrayDi", ArrayDi.class);
		Assert.assertNotNull(arrayDi);
		arrayDi.printOut();
		
		MapDi mapDi = ctx.getBean("mapDi", MapDi.class);
		Assert.assertNotNull(mapDi);
		mapDi.printOut();
		
		ListDi listDi02 = ctx.getBean("listDi02", ListDi.class);
		Assert.assertNotNull(listDi);
		listDi.printOut();
		
	}
}
