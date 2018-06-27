package pro.jing.bean.instantiation;

import org.springframework.util.StringUtils;

public class ResporityImpl implements IRespority {

	private String name;

	public ResporityImpl() {
		System.out.println("ResporityImpl constructor...");
	}

	public ResporityImpl(String name) {
		this.name = name;
	}

	@Override
	public void add() {
		System.out.println("Respority.add()" + (StringUtils.isEmpty(name) ? "" : name));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
