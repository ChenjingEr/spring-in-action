package pro.jing.bean.di.xml;

public class ServiceImpl implements IService {

	private ResporityImpl respority;
	private String name;

	public ServiceImpl() {
		System.out.println("ServiceImpl constructor...");
	}

	public ServiceImpl(ResporityImpl respority, String name) {
		super();
		this.respority = respority;
		this.name = name;
	}

	@Override
	public void add() {
		System.out.println("ServiceImpl.add(),name = " + name);
		respority.add();
	}

	public ResporityImpl getRespority() {
		return respority;
	}

	public void setRespority(ResporityImpl respority) {
		this.respority = respority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
