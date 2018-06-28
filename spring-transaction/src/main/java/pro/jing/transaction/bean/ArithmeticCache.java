package pro.jing.transaction.bean;

public class ArithmeticCache {

	private Integer id;
	private String op;
	private Integer opOne;
	private Integer opTwo;
	private Integer result;
	
	
	
	public ArithmeticCache(String op, Integer opOne, Integer opTwo, Integer result) {
		this.op = op;
		this.opOne = opOne;
		this.opTwo = opTwo;
		this.result = result;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public Integer getOpOne() {
		return opOne;
	}
	public void setOpOne(Integer opOne) {
		this.opOne = opOne;
	}
	public Integer getOpTwo() {
		return opTwo;
	}
	public void setOpTwo(Integer opTwo) {
		this.opTwo = opTwo;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "ArithmeticCache [id=" + id + ", op=" + op + ", opOne=" + opOne + ", opTwo=" + opTwo + ", result="
				+ result + "]";
	}
	
	
	
}
