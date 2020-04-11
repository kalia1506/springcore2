package kcp.spring.configuration;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kcp.spring.beans")
public class AppConfig {
	@Bean("calendar")
	public Calendar crateCalendar() {
			
		return Calendar.getInstance();
	}

}
