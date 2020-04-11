package kcp.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import kcp.spring.beans.WebContainer;

public class LIMproblem {

	private static String path="kcp/spring/configuration/applicationContext.xml";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		WebContainer container1,container2;
		context=new ClassPathXmlApplicationContext(path);
		container1=context.getBean("target",WebContainer.class);
		System.out.println();
		container1.ProcessData("  hai");
		System.out.println("*******************************************************");
		System.out.println();
		container2=context.getBean("target",WebContainer.class);
		container2.ProcessData("  hello");
		
	}

}
