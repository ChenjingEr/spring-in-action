package pro.jing.bean.di.annotation;

import org.springframework.stereotype.Component;

@Component
public class ResporityImpl implements IRespority{

	@Override
	public void add() {
		System.out.println("Respority.add()");
	}

}
