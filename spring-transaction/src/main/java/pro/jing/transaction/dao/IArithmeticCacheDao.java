package pro.jing.transaction.dao;

import pro.jing.transaction.ArithmeticExecpetion;

public interface IArithmeticCacheDao {

	void saveAddCache(int i, int j);

	void saveSubCache(int i, int j);

	void saveMulCache(int i, int j);

	void saveDivCache(int i, int j) throws ArithmeticExecpetion ;
}
