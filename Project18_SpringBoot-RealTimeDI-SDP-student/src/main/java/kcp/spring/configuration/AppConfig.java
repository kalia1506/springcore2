package kcp.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
//@ComponentScan(basePackages = {"kcp.spring.dao","kcp.spring.controller","kcp.spring.sevice"})
@Import({ PersistanceConfig.class, ServiceConfig.class, ControllerConfig.class })
public class AppConfig {
	/*
		@Autowired
		private Environment env;
		private HikariDataSource HDataSoure;
		
		@Bean("dataSource")
		public HikariDataSource getDriver() {
			HDataSoure.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
			HDataSoure.setJdbcUrl(env.getProperty("spring.datasource.url"));
			HDataSoure.setPassword(env.getProperty("spring.datasource.username"));
			HDataSoure.setUsername(env.getProperty("spring.datasource.password"));
			return HDataSoure;
		
		}*/

}
