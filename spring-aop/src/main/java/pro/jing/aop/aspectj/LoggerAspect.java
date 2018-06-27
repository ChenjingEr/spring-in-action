package pro.jing.aop.aspectj;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

	@Before("execution( public int pro.jing.aop.aspectj.SimpleCalculatorImpl.*(int, int))")
	public void beforeMethod(JoinPoint joinPoint) {

		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("beofre " + methodName + "  begin with ->" + args);
	}
	
	@After("execution( public int pro.jing.aop.aspectj.SimpleCalculatorImpl.*(int, int))")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("after " + methodName + " end ");
	}
	

	@AfterReturning(value = "execution( public int pro.jing.aop.aspectj.SimpleCalculatorImpl.*(int, int))",returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result) {
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println("after " + methodName + " return with -> " + result);
	}
	@AfterThrowing(value = "execution( public int pro.jing.aop.aspectj.SimpleCalculatorImpl.*(int, int))",throwing="ex")
	public void afterThrowing(JoinPoint joinPoint,Exception ex) {
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println("after " + methodName + " after throwing -> " + ex);
	}
}
