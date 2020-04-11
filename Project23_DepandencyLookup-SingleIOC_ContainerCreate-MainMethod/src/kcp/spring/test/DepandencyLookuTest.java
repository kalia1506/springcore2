package kcp.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import kcp.spring.beans.Crickter;

@SuppressWarnings("deprecation")
public class DepandencyLookuTest {

    private static String path="kcp/spring/configuration/applicationContext.xml";

	public static void main(String[] args) {
	
    	BeanFactory factory=null;
		Crickter crktr=null;
		  //create IOC container
		factory=new XmlBeanFactory(new ClassPathResource(path));
		System.out.println("main IOC container");
		//get Target Bean class object
		crktr=factory.getBean("crktr",Crickter.class);
		//invoke mehtods
		crktr.fielding();
		crktr.bowling();
		crktr.batting(factory);

    }

}
