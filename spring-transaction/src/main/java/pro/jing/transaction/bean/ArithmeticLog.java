package pro.jing.transaction.bean;

import java.util.Date;

public class ArithmeticLog {

	private Integer id;
	private String log;
	private Date date;
	
	public ArithmeticLog(String log, Date date) {
		super();
		this.log = log;
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "ArithmeticLog [id=" + id + ", log=" + log + ", date=" + date + "]";
	}
	
	
	
}
