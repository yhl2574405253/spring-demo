package demo03.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/**
 * spring实现aop 用了两种技术
 *    1 java动态代理 （面向接口编程）
 *    2 cglib实现动态代理
 * @author Administrator
 *
 */
public class TestCotainer {
	static ApplicationContext context;

	static {
		 context = new ClassPathXmlApplicationContext("demo03/aop/spring.xml");
	}

	public static void main(String[] args) {
		AfHouseOwner ho = (AfHouseOwner) context.getBean("afHouseOwner");
		ho.seekMyHouse();
	}
}