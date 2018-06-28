package pro.jing.jdbc.bean.dao;

import java.util.List;

import pro.jing.jdbc.bean.City;

public interface ICityDao {

	void add(City city);
	void delete(Integer id);
	void update(City city);
	City query(Integer id);
	void addBatch(List<City> cities);
	List<City> queryList(Integer size);
}
