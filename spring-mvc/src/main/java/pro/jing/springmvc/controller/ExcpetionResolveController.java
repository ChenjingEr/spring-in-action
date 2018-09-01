package pro.jing.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExcpetionResolveController {
	
	@RequestMapping("/ex")
	public String exception() {
		return "exception";
	}

	@RequestMapping("/exceptionSolve")
	public String exceptionSolve(@RequestParam(value="i") int i) {
		System.out.println(10 / i);
		return "success";
	}
}
