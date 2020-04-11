package kcp.spring.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
//@ComponentScan(basePackages = {"kcp.spring.dao","kcp.spring.controller","kcp.spring.sevice"})
@Import({ PersistanceConfig.class, ServiceConfig.class, ControllerConfig.class })
public class AppConfig {
	

}
