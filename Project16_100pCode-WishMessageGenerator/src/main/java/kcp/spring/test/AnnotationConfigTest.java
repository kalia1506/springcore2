package kcp.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kcp.spring.beans.WishMessageGeneretor;
import kcp.spring.configuration.AppConfig;

public class AnnotationConfigTest {
	public static void main(String[] args) {
		ApplicationContext context;
		WishMessageGeneretor meGeneretor;
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("AnnotationConfigTest.main(1)");
		meGeneretor=context.getBean("wishMessage",WishMessageGeneretor.class);
		System.out.println("AnnotationConfigTest.main(2)");
		System.out.println(meGeneretor.getwishMessage("kalu"));
		System.out.println("AnnotationConfigTest.main(3)");

	}
}
