package pro.jing.di;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pro.jing.di.cfg.xml_based.ArrayDi;
import pro.jing.di.cfg.xml_based.CfgApi;
import pro.jing.di.cfg.xml_based.CfgImpl;
import pro.jing.di.cfg.xml_based.CfgImpl2;
import pro.jing.di.cfg.xml_based.ListDi;
import pro.jing.di.cfg.xml_based.MapDi;
import pro.jing.di.cfg.xml_based.SetDi;

public class DiTest {

	/*
	 * 构造器注入测试
	 */
//	@Test
	public void constructorDiTest() {
		BeanFactory bf = new ClassPathXmlApplicationContext("/di/di.xml");
		CfgApi cfg = bf.getBean("byName", CfgImpl.class);
		Assert.assertNotNull(cfg);
		cfg.doSomething();
		
		CfgApi cfg02 = bf.getBean("byType", CfgImpl.class);
		Assert.assertNotNull(cfg02);
		cfg02.doSomething();
		
		CfgApi cfg03 = bf.getBean("byName", CfgImpl.class);
		Assert.assertNotNull(cfg03);
		cfg03.doSomething();
	}
	
	/**
	 * 构造器注入测试
	 */
//	@Test
	public void constructorDi02Test() {
		BeanFactory bf = new ClassPathXmlApplicationContext("/di/di.xml");
		CfgApi cByIndex = bf.getBean("cByIndex", CfgImpl.class);
		Assert.assertNotNull(cByIndex);
		cByIndex.doSomething();
		
		CfgApi cByName = bf.getBean("cByName", CfgImpl.class);
		Assert.assertNotNull(cByName);
		cByIndex.doSomething();
	}
	
	/**
	 * setter注入
	 */
//	@Test
	public void propertyDiTest() {
		BeanFactory bf = new ClassPathXmlApplicationContext("/di/di.xml");
		CfgApi setterByName = bf.getBean("setterByName", CfgImpl2.class);
		Assert.assertNotNull(setterByName);
		setterByName.doSomething();
	}
	
	/**
	 * p标签
	 */
//	@Test
	public void propertyDi02Test() {
		BeanFactory bf = new ClassPathXmlApplicationContext("/di/di.xml");
		CfgApi pByName = bf.getBean("pByName", CfgImpl2.class);
		Assert.assertNotNull(pByName);
		pByName.doSomething();
	}
	
	/**
	 * 集合注入
	 */
	@Test
	public void listDiTest() {
		BeanFactory bf = new ClassPathXmlApplicationContext("/di/di.xml");
		ListDi listDi = bf.getBean("listDi", ListDi.class);
		Assert.assertNotNull(listDi);
		listDi.printOut();
		
		SetDi setDi = bf.getBean("setDi", SetDi.class);
		Assert.assertNotNull(setDi);
		setDi.printOut();
		
		ArrayDi arrayDi = bf.getBean("arrayDi", ArrayDi.class);
		Assert.assertNotNull(arrayDi);
		arrayDi.printOut();
		
		MapDi mapDi = bf.getBean("mapDi", MapDi.class);
		Assert.assertNotNull(mapDi);
		mapDi.printOut();
	}
	
	
	
}
