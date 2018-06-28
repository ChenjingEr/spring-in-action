package pro.jing.jdbc.bean.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import pro.jing.jdbc.bean.City;

@Repository
public class CityDaoImpl implements ICityDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(City city) {
		String sql = "INSERT INTO city(city_name, city_code) VALUES (?,?)";
		jdbcTemplate.update(sql, city.getCityName(), city.getCityCode());
	}

	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM city WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public void update(City city) {
		String sql = "UPDATE city SET city_name = ?, city_code = ?";
		jdbcTemplate.update(sql, city.getCityName(), city.getCityCode());
	}

	@Override
	public City query(Integer id) {
		String sql = "SELECT id, city_name cityName, city_code cityCode FROM city WHERE id = ?";
		RowMapper<City> rowMapper = new BeanPropertyRowMapper<>(City.class);
		return jdbcTemplate.queryForObject(sql, rowMapper, 1);
	}

	@Override
	public void addBatch(List<City> cities) {
		String sql = "INSERT INTO city(city_name,city_code) values(?,?)";
		List<Object[]> cityArgs = new ArrayList<>();
		for (City city : cities)
			cityArgs.add(new Object[] { city.getCityName(), city.getCityCode() });
		jdbcTemplate.batchUpdate(sql, cityArgs);
	}

	@Override
	public List<City> queryList(Integer id) {
		String sql = "SELECT id, city_name cityName, city_code cityCode FROM city WHERE id < ?";
		RowMapper<City> rowMapper = new BeanPropertyRowMapper<>(City.class);
		return jdbcTemplate.query(sql, rowMapper,id);
	}

}
