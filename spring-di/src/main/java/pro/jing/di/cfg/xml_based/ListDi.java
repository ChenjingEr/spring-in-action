package pro.jing.di.cfg.xml_based;

import java.util.List;

public class ListDi {

	private List<String> list;

	public void printOut() {
		System.out.println(list);
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	
}
