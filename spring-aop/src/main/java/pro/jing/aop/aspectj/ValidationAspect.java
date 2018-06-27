package pro.jing.aop.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author JING
 * @Date 2018年6月27日
 * @description 提取切入表达式
 */
@Order(1)
@Aspect
@Component
public class ValidationAspect {

	@Pointcut("execution( public int pro.jing.aop.aspectj.SimpleCalculatorImpl.*(int, int))")
	public void joinPoint() {}
	
	@Before("joinPoint()")
	public void beforeMthoed() {
		System.out.println("validation before.....");
	}
	@After("joinPoint()")
	public void afterMthoed() {
		System.out.println("validation after.....");
	}
}
