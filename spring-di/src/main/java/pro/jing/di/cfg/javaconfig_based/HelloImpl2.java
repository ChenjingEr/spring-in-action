package pro.jing.di.cfg.javaconfig_based;

public class HelloImpl2 implements HelloApi {

	private Somebody somebody;

	public HelloImpl2(Somebody somebody) {
		this.somebody = somebody;
	}

	@Override
	public void say(String what) {
		System.out.println(somebody.getName() + "...say..." + what);
	}

}
