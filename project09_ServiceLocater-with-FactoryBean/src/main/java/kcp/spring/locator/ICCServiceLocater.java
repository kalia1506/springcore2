package kcp.spring.locator;

import org.springframework.beans.factory.FactoryBean;

import kcp.spring.external.External_ICC_Service;
import kcp.spring.external.External_ICC_ServiceImpl;

public class ICCServiceLocater implements FactoryBean<External_ICC_Service> {

	@Override
	public External_ICC_Service getObject() throws Exception {
		External_ICC_Service e=new External_ICC_ServiceImpl();
		return e;
	}

	@Override
	public Class<?> getObjectType() {
		return External_ICC_Service.class;
	}
	@Override
	public boolean isSingleton() {
		return true;
	}

}
