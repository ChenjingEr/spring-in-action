package pro.jing.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pro.jing.jdbc.bean.City;
import pro.jing.jdbc.bean.dao.ICityDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CityDaoTest {

	@Autowired
	private ICityDao cityDao;

	// @Test
	public void addTest() {
		City city = new City("BeiJing", "北京");
		cityDao.add(city);
	}

	// @Test
	public void queryTest() {
		City city = cityDao.query(1);
		System.out.println(city);
	}

	// @Test
	public void addBatch() {
		List<City> list = new ArrayList<>();
		list.add(new City("ShangHai", "上海"));
		list.add(new City("NanJing", "南京"));
		list.add(new City("HangZhou", "杭州"));
		cityDao.addBatch(list);

	}

	// @Test
	public void queryList() {
		List<City> cities = cityDao.queryList(5);
		System.out.println(cities);
	}
	
	@Test
	public void update() {
		City city = cityDao.query(1);
		System.out.println(city);
		city.setCityName("aa");
		city.setCityCode("aa");
		cityDao.update(city);
		city = cityDao.query(1);
		System.out.println(city);
	}
}
