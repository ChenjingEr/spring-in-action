package pro.jing.aop.aspectj_based;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 
 * @author Jing
 * @date Jun 13, 2018
 * @description aspectj支持
 */
@Aspect
public class LoggerAspect {

	@Pointcut(value = "execution(* pro.jing.aop.aspectj_based.InfinitePossibility.infinitePossibility())")
	public void infinitePossibility() {
	}
	
	@Pointcut(value="execution(* pro.jing.aop.aspectj_based.InfinitePossibility.infinite(..)) && args(name,word)")
	public void infinite(String name, String word){}

	@Before(value = "infinitePossibility()")
	public void before() {
		System.out.println(" bofore...");
	}

	@After(value = "infinitePossibility()")
	public void after() {
		System.out.println(" after...");
	}
	
//	@Before(value = "infinite(name,word)")
//	public void beforeArgs() {
//		System.out.println(" bofore args...");
//	}
}
