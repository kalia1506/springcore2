package kcp.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.spring.beans.Student;

public class DepandencyCheckTest {

	private static String path="kcp/spring/configuration/applicationContext.xml";

	public static void main(String[] args) {
			ApplicationContext context;
			Student s;
			context=new ClassPathXmlApplicationContext(path);
			s=context.getBean("Student",Student.class);
			System.out.println(s);
	}

}
