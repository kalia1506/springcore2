package kcp.springBoot.wishMessageGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import kcp.spring.beans.WishMessage;
import kcp.spring.configuration.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class Project17SpringBootWishMessageGeneratorUsingSetterInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		WishMessage message = null;
		context = SpringApplication.
				run(Project17SpringBootWishMessageGeneratorUsingSetterInjectionApplication.class,args);
		message = context.getBean("wish", WishMessage.class);
		System.out.println(message.getMessage("kalia"));

	}

}
