package kcp.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.spring.beans.Viechle;



public class NamedTest {

	public static void main(String[] args) {
		String path = "kcp/spring/configuration/applicationContext.xml";
		ApplicationContext context=null;
		Viechle viechle=null;
		context=new ClassPathXmlApplicationContext(path);
		viechle=context.getBean("viechle",Viechle.class);
		System.out.println(viechle);
	}

}
