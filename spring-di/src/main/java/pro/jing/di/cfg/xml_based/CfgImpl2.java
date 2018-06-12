package pro.jing.di.cfg.xml_based;

/**
 * 
 * @author Jing
 * @date 2018/06/12
 * @description 属性注入
 */
public class CfgImpl2 implements CfgApi {

	private SourceCfgApi where;
	private String what;

	public void doSomething() {
		where.showSource();
		System.out.println(what);
	}

	public SourceCfgApi getWhere() {
		return where;
	}

	public void setWhere(SourceCfgApi where) {
		this.where = where;
	}

	public String getWhat() {
		return what;
	}

	public void setWhat(String what) {
		this.what = what;
	}
	
	

}
