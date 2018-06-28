package pro.jing.transaction.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pro.jing.transaction.ArithmeticExecpetion;
import pro.jing.transaction.bean.ArithmeticLog;
import pro.jing.transaction.dao.IArithmeticCacheDao;
import pro.jing.transaction.dao.IArithmeticCacheLogDao;

@Service
public class ArithmeticServiceImpl implements IArithmeticService {

	@Autowired
	private IArithmeticCacheDao cacheDao;
	@Autowired
	private IArithmeticCacheLogDao logDao;

	@Override
	public void add(int i, int j) {

	}

	@Override
	public void sub(int i, int j) {

	}

	@Override
	public void mul(int i, int j) {

	}

	@Transactional
	@Override
	public void div(int i, int j) throws ArithmeticExecpetion {
		cacheDao.saveDivCache(i, j);
		ArithmeticLog log = new ArithmeticLog(i + "/" + j, new Date());
		logDao.saveLog(log);
	}

}
