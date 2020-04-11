package kcp.spring.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:kcp/spring/configuration/applicationContext.xml")
public class AppConfig {

}
