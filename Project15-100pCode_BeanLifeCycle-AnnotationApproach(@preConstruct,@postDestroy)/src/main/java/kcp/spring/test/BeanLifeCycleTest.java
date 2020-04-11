package kcp.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import kcp.spring.beans.VoterCheckEligible;
import kcp.spring.configuration.AppConfiguration;

public class BeanLifeCycleTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=null;
		VoterCheckEligible vote=null;
		context=new AnnotationConfigApplicationContext(AppConfiguration.class );
		vote=context.getBean("check",VoterCheckEligible.class);
		System.out.println(vote);
		System.out.println("Result::"+vote.checkEligibility());
		((AbstractApplicationContext) context).close();
		

	}

}
