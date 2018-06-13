package pro.jing.aop.aspectj_based;

public class InfinitePossibilityImpl implements InfinitePossibility {

	@Override
	public void infinitePossibility() {
		System.out.println(" infinite possibility...");
	}

	@Override
	public void infinite(String name, String word) {
		System.out.println(name + " " + word);
	}

}
