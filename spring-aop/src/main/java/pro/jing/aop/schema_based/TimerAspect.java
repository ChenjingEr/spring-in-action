package pro.jing.aop.schema_based;

/**
 * 
 * @author Jing
 * @date Jun 13, 2018
 * @description aop aspect
 */
public class TimerAspect {

	public void before() {
		System.out.println(System.currentTimeMillis() + " start");
	}

	public void after() {
		System.out.println(System.currentTimeMillis() + " end");
	}
	
	public void around() {
		System.out.println(" running...");
	}
	
	public void afterReturning() {
		System.out.println(" ending...");
	}
	
	public void afterThrowing() {
		System.out.println(" Oo.Oo..");
	}
}
