package kcp.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.spring.beans.StudentBean;

public class BeanLifeFlow {
	public static void main(String[] args) {
		ApplicationContext context=null;
		StudentBean s=null;
		String path="kcp/spring/configuration/applicationContext.xml";
		context=new ClassPathXmlApplicationContext(path);
		s=context.getBean("s",StudentBean.class);
		System.out.println(s);
		((AbstractApplicationContext) context).close();
		
		
	}

}
