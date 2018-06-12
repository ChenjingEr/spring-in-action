package pro.jing.di.cfg.annotation_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Jing
 * @date Jun 12, 2018
 * @description 基于注解配置方式
 */
@Component
public class WelcomeImpl implements WelcomeApi{
	
	@Autowired
	private Who who;

	@Override
	public void welcome() {
		System.out.println(who.getName() + " say...");
	}

}
