package pro.jing.bean.cycle;

import org.springframework.util.StringUtils;

public class ResporityImpl implements IRespority {

	private String name;

	public void init() {
		System.out.println("ResporityImpl init...");
	}

	public void destory() {
		System.out.println("ResporityImpl destory...");
	}

	public ResporityImpl() {
		System.out.println("ResporityImpl constructor...");
	}

	@Override
	public void add() {
		System.out.println("Respority.add()" + (StringUtils.isEmpty(name) ? name : ""));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
