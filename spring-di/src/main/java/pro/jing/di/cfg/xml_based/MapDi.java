package pro.jing.di.cfg.xml_based;

import java.util.Map;

public class MapDi {

	private Map<String, Integer> map;

	public void printOut() {
		System.out.println(map);
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

}
