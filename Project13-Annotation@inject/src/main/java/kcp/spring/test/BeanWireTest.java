package kcp.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.spring.beans.Man;

public class BeanWireTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String path = "kcp/spring/configuration/applicationContext.xml";
		ApplicationContext context=null;
		Man man=null;
		context=new ClassPathXmlApplicationContext(path);
		man=context.getBean("man",Man.class);
		System.out.println(man);
		
	}

}
