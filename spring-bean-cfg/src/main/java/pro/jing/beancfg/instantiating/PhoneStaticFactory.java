package pro.jing.beancfg.instantiating;

public  class PhoneStaticFactory {

	private static Phone phone = new Phone();

	public static Phone getPhone() {
		return phone;
	}
}
