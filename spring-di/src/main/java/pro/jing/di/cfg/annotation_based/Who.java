package pro.jing.di.cfg.annotation_based;

import org.springframework.stereotype.Component;

@Component
public class Who {
	
	private String name;

	public Who() {
		this.name = "Jing ";
	}
	
	public String getName() {
		return this.name;
	}
}
