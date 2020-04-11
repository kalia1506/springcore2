package kcp.spring.configuration;

import java.util.Calendar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kcp.spring.beans")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig.AppConfig(0 param constructer)");
	}

	@Bean(name = "calender")
	public Calendar getCalender() {
		System.out.println("AppConfig.getCalender()");
		return Calendar.getInstance();
	}
}
