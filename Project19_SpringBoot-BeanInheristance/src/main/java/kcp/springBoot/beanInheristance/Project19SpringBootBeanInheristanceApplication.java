package kcp.springBoot.beanInheristance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import kcp.spring.beans.PulsorBike;
import kcp.spring.configuration.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class Project19SpringBootBeanInheristanceApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		PulsorBike p1,p2;
		context = SpringApplication.run(Project19SpringBootBeanInheristanceApplication.class, args);
		p1=context.getBean("rajaplusor",PulsorBike.class);
		System.out.println(p1);
	}

}
