package pro.jing.bean.instantiation;

import java.util.HashMap;
import java.util.Map;


public class ResporityInstanceFactory {

	private  Map<String,IRespority> resporities = new HashMap<>();
	
	public ResporityInstanceFactory() {
		resporities.put("r01", new ResporityImpl("r01"));
		resporities.put("r02", new ResporityImpl("r02"));
	}
	
	public  IRespority getObject(String name) {
		System.out.println("instance factory ...");
		return resporities.get(name);
	}
}
