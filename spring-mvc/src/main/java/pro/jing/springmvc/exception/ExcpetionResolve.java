package pro.jing.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcpetionResolve {

	@ExceptionHandler
	public String commonException(Exception ex) {
		System.out.println(ex.getMessage());
		return "error";
	}
}
