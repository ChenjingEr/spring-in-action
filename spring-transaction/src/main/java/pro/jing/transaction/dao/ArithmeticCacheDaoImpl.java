package pro.jing.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pro.jing.transaction.ArithmeticExecpetion;

@Repository
public class ArithmeticCacheDaoImpl implements IArithmeticCacheDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveAddCache(int i, int j) {
		String sql = "INSERT INTO arithmetic_cache(op, op_one, op_two, result) VALUES(?,?,?,?)";
		jdbcTemplate.update(sql, "+", i, j, i + j);
	}

	@Override
	public void saveSubCache(int i, int j) {
		String sql = "INSERT INTO arithmetic_cache(op, op_one, op_two, result) VALUES(?,?,?,?)";
		jdbcTemplate.update(sql, "+", i, j, i - j);
	}

	@Override
	public void saveMulCache(int i, int j) {
		String sql = "INSERT INTO arithmetic_cache(op, op_one, op_two, result) VALUES(?,?,?,?)";
		jdbcTemplate.update(sql, "+", i, j, i * j);
	}

	@Override
	public void saveDivCache(int i, int j) throws ArithmeticExecpetion {
		if (j == 0) {
			throw new ArithmeticExecpetion("除数不可为0！");
		}
		String sql = "INSERT INTO arithmetic_cache(op, op_one, op_two, result) VALUES(?,?,?,?)";
		jdbcTemplate.update(sql, "+", i, j, i * j);

	}

}
