package pro.jing.bean.di.xml.collection;

import java.util.Arrays;

public class ArrayDi {

	private String[] array;
	
	public void printOut() {
		System.out.println(Arrays.asList(array));
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}
	
	
}
