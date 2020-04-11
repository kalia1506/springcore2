package kcp.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.spring.beans.VoterCheckEligible;

public class BeanLifeCycleTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String path="kcp/spring/configuration/applicationContext.xml";
		ApplicationContext context=null;
		VoterCheckEligible vote=null;
		context=new ClassPathXmlApplicationContext(path);
		vote=context.getBean("check",VoterCheckEligible.class);
		System.out.println(vote);
		System.out.println("Result::"+vote.checkEligibility());
		((AbstractApplicationContext) context).close();
		

	}

}
