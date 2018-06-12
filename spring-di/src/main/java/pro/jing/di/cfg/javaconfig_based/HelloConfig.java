package pro.jing.di.cfg.javaconfig_based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Jing
 * @date Jun 12, 2018
 * @description JavaConfig Bean 描述
 */
@Configuration
public class HelloConfig {

	@Bean(name = "hello")
	public HelloApi helloApi() {
		return new HelloImpl();
	}
	
	@Bean(name="somebody")
	public Somebody somebody() {
		return new Somebody();
	}
	
	/**
	 * javaconfig 注入方式
	 */
	@Bean(name="hello02")
	public HelloApi hello02() {
		return new HelloImpl2(somebody());
	}
}
