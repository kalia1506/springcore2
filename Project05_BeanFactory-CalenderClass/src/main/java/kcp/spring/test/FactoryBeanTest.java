package kcp.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.spring.beans.ScheduleReminder;

public class FactoryBeanTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		String path = "kcp/spring/configuration/applicationContext.xml";
		ScheduleReminder reminder=null;
		context= new ClassPathXmlApplicationContext(path);
		reminder=context.getBean("schedule",ScheduleReminder.class);
		System.out.println(reminder.confrimAppoinment());

	}

}
