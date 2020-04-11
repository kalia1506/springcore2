package kcp.spring.IOCcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class IOC_Container {
	private static String path = "kcp/spring/configuration/applicationContext.xml";
	static BeanFactory factory = null;
	static {
		factory = new XmlBeanFactory(new ClassPathResource(path));
	}

	public static BeanFactory getContainer() {
			if (factory!=null) {
				return factory;
			}else {
				return null;
			}
		

	}
}
