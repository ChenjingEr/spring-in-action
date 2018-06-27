package pro.jing.bean.di.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author JING
 * @Date 2018��6��27��
 * @description Java Config ����Bean�ķ�ʽ
 */
@Configuration
public class Config {

	@Bean(name="respority")
	public IRespority getRespority() {
		return new ResporityImpl();
	}
	
	@Bean(name="service")
	public IService getService() {
		//����Baen�ķ�ʽ
		return new ServiceImpl(getRespority());
	}
}
