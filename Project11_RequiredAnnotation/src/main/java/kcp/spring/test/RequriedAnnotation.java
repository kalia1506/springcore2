package kcp.spring.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.spring.beans.Mobile;

public class RequriedAnnotation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String path = "kcp/spring/configuration/applicationContext.xml";
		ApplicationContext context=null;
		Mobile mobile=null;
		context=new ClassPathXmlApplicationContext(path);
		mobile=context.getBean("mob",Mobile.class);
		System.out.println(mobile);
		
	
	}

}
