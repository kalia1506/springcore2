package kcp.spring.configuration;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "kcp.spring.dao")
public class PersistanceConfig {

	@Bean("HKds")
	@Profile("dev")
	public DataSource getHKDriver() {
		System.out.println("PersistanceConfig.getHKDriver()");
		HikariDataSource HDataSoure = new HikariDataSource();
		HDataSoure.setDriverClassName("com.mysql.cj.jdbc.Driver");
		HDataSoure.setJdbcUrl("jdbc:mysql:///spring712");
		HDataSoure.setUsername("root");
		HDataSoure.setPassword("root");
		return HDataSoure;

	}

	@Bean("BDs")
	@Profile("prod")
	public DataSource getDBCPDriver() {
		System.out.println("PersistanceConfig.getDBCPDriver()");
		BasicDataSource dbcp = new BasicDataSource();
		dbcp.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dbcp.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dbcp.setPassword("kalia");
		dbcp.setUsername("system");
		return dbcp;

	}

	@Bean("CPds")
	@Profile("test")
	public DataSource getC3P0Driver() throws Exception {
		System.out.println("PersistanceConfig.getC3P0Driver()");
		ComboPooledDataSource c3po = new ComboPooledDataSource();
		c3po.setDriverClass("org.postgresql.Driver");
		c3po.setJdbcUrl("jdbc:postgresql:///spring712");
		c3po.setPassword("kalia");
		c3po.setUser("postgres");
		return c3po;

	}

}
