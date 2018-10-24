package demo02.configbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * 添加了@Configuration spring容器在初始化的时候会自动扫描
 */
@Configuration
public class MyConf {
	@Value("${url}")
	private String url;
	
	@Value("${driverClass}")
	private String driverClassName;
	
	@Value("${username1}")
	private String userName;
	
	@Value("${password1}")
	private String password;


//	相当于：
//	<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
//	   <property name="url" value="${url}" ></property>
//	   <property name="username" value="${username1}" ></property>
//	   <property name="password" value="${password1}" ></property>
//	   <property name="driverClassName" value="${driverClass}" ></property>
//   </bean>
	@Bean
	public DataSource dataSouce(){
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setUrl(url);
		dmds.setDriverClassName(driverClassName);
		dmds.setUsername(userName);
		dmds.setPassword(password);
		return dmds;
	}

//	相当于：
//	<bean id="template" class="org.springframework.jdbc.core.JdbcTemplate">
//   		<property name="dataSource" ref="dataSource"></property>
//   </bean>
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	

	
}
