package kcp.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("kcp/spring/common/info.properties")
@ComponentScan(basePackages = "kcp.spring.beans")
public class AppConfiguration {

}
