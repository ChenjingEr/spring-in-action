package pro.jing.transaction.service;

import pro.jing.transaction.ArithmeticExecpetion;

public interface IArithmeticService {

	void add(int i, int j);

	void sub(int i, int j);

	void mul(int i, int j);

	void div(int i, int j) throws ArithmeticExecpetion;
}
