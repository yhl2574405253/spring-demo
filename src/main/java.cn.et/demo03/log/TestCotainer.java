package demo03.log;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * spring实现aop 用了两种技术
 *    1 java动态代理 （面向接口编程）
 *    2 cglib实现动态代理
 * @author Administrator
 *
 */
public class TestCotainer {
	static ConfigurableApplicationContext  context;
	static{
		context = new GenericXmlApplicationContext("classpath:/demo03/log/spring.xml");
	}

	public static void main(String[] args) {
		User ho=(User)context.getBean("user");
		for(int i=0;i<=10;i++){
			ho.login();
		}
		ho.buy();
		ho.buy();

		Admin admin=(Admin)context.getBean("admin");
		admin.addCom();
		admin.addCom();
		admin.addCom();
	}
}
