package pro.jing.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pro.jing.transaction.bean.ArithmeticLog;

@Repository
public class ArithmeticCacheLogDaoImpl implements IArithmeticCacheLogDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveLog(ArithmeticLog log) {
		String sql = "INSERT INTO arithmetic_log(log, date) VALUES(?,?)";
		jdbcTemplate.update(sql, log.getLog(), log.getDate());
		
	}
	

}
