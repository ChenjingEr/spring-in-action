package pro.jing.bean.di.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author JING
 * @Date 2018年6月27日
 * @description Java Config 配置Bean的方式
 */
@Configuration
public class Config {

	@Bean(name="respority")
	public IRespority getRespority() {
		return new ResporityImpl();
	}
	
	@Bean(name="service")
	public IService getService() {
		//配置Baen的方式
		return new ServiceImpl(getRespority());
	}
}
