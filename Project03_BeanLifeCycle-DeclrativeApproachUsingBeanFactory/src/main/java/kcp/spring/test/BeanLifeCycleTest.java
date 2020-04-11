package kcp.spring.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


import kcp.spring.beans.VoterCheckEligible;

public class BeanLifeCycleTest {

	
	public static void main(String[] args) {
		String path="kcp/spring/configuration/applicationContext.xml";
		
		VoterCheckEligible vote=null;
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new  XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(path);
		vote=factory.getBean("check",VoterCheckEligible.class);
		System.out.println(vote);
		
		

	}

}
