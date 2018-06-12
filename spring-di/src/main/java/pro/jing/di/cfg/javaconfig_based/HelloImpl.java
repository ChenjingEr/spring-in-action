package pro.jing.di.cfg.javaconfig_based;

public class HelloImpl implements HelloApi{

	@Override
	public void say(String what) {
		System.out.println("say..." + what);
	}

}
