package kcp.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.spring.service.BankSerivce;

public class MethodReplacementInjection {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String path = "kcp/spring/configuration/applicationContext.xml";
		ApplicationContext context;
		BankSerivce serivce = null;
		context = new ClassPathXmlApplicationContext(path);
		serivce = context.getBean("Service", BankSerivce.class);
		System.out.println(serivce.simpleAmountInterest(12000, 10));
		System.out.println(serivce.getClass()+"****"+serivce.getClass().getSuperclass());
		System.out.println("############################################");
		System.out.println(serivce.CalcSqureArea(20));

	}

}
