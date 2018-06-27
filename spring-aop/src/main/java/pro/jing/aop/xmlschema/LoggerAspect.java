package pro.jing.aop.xmlschema;

import java.util.Arrays;
import java.util.List;
import org.aspectj.lang.JoinPoint;

public class LoggerAspect {

	public void beforeMethod(JoinPoint joinPoint) {

		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("beofre " + methodName + "  begin with ->" + args);
	}
	
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("after " + methodName + " end ");
	}
	

	public void afterReturning(JoinPoint joinPoint,Object result) {
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println("after " + methodName + " return with -> " + result);
	}
	
	public void afterThrowing(JoinPoint joinPoint,Exception ex) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("after " + methodName + " after throwing -> " + ex);
	}
}
