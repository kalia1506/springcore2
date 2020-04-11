package kcp.spring.locator;
import kcp.spring.external.External_ICC_Service;
import kcp.spring.external.External_ICC_ServiceImpl;

public class ICCServiceLocater {
	static External_ICC_Service e = new External_ICC_ServiceImpl();

	public static External_ICC_Service getInstance() {
		return e;

	}

}
