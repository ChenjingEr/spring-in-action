package pro.jing.bean.di.java_config;

public class ServiceImpl implements IService {

	private IRespority respority;
	private String name;

	public ServiceImpl() {
		System.out.println("ServiceImpl constructor...");
	}
	
	public ServiceImpl(IRespority respority) {
		this.respority = respority;
		System.out.println("ServiceImpl constructor...");
	}

	public ServiceImpl(IRespority respority, String name) {
		super();
		this.respority = respority;
		this.name = name;
	}

	@Override
	public void add() {
		System.out.println("ServiceImpl.add(),name = " + name);
		respority.add();
	}

	public IRespority getRespority() {
		return respority;
	}

	public void setRespority(IRespority respority) {
		this.respority = respority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
