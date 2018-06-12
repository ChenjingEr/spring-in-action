package pro.jing.di.cfg.xml_based;

/**
 * 
 * @author Jing
 * @date 2018/06/12
 * @description 构造器依赖注入
 */
public class CfgImpl implements CfgApi {

	private SourceCfgApi where;
	private String what;

	public CfgImpl(SourceCfgApi where, String what) {
		this.where = where;
		this.what = what;
	}

	public void doSomething() {
		where.showSource();
		System.out.println(what);
	}

}
