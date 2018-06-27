package pro.jing.bean.instantiation;

import org.springframework.beans.factory.FactoryBean;

public class ResporityFactoryBean implements FactoryBean<IRespority>{

	@Override
	public IRespority getObject() throws Exception {
		return new ResporityImpl("factory bean...");
	}

	@Override
	public Class<?> getObjectType() {
		return ResporityImpl.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
