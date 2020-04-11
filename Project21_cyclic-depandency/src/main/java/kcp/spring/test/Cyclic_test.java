package kcp.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.spring.beans.B;

public class Cyclic_test {

	private static String path="kcp/spring/configuration/applicationContext.xml";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
			ApplicationContext context=null;
			B b=null;
			context= new ClassPathXmlApplicationContext(path);
			b=context.getBean("b",B.class);
			System.out.println(b);
	}

}
