package pro.jing.springmvc.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author JING
 * @Date 2018年7月15日
 * @description spring mvc中参数
 */
@Controller
public class ParameterController {

	@RequestMapping("/param")
	public String param() {
		return "param";
	}

	@RequestMapping("/date")
	public String datParameter(Date date, String user) {
		System.out.println("date : " + date + " user : " + user);
		return "success";
	}

	@RequestMapping("/number")
	public String numberParameter(Double num, String user) {
		System.out.println(num + " : " + user);
		return "success";
	}

	@RequestMapping("/requestParam")
	public String requestParam(@RequestParam(value = "username") String userName,
			@RequestParam(value = "pass", required = false, defaultValue = "default-pass") String pass) {
		System.out.println("username : " + userName + ", pass :" + pass);
		return "success";
	}

	@RequestMapping("/cookieValue")
	public String cookieValue(@CookieValue(value = "JSESSIONID") String jsessionId) {
		System.out.println("cookievalue : " + jsessionId);
		return "success";
	}
}
