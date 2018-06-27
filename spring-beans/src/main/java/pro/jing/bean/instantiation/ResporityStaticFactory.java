package pro.jing.bean.instantiation;

import java.util.HashMap;
import java.util.Map;


public class ResporityStaticFactory {

	private static Map<String,IRespority> resporities = new HashMap<>();
	
	static {
		resporities.put("r01", new ResporityImpl("r01"));
		resporities.put("r02", new ResporityImpl("r02"));
	}
	
	public static IRespority getObject(String name) {
		System.out.println("static factory...");
		return resporities.get(name);
	}
}
