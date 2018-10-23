package demo02.anno;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class annoTest {
	static ConfigurableApplicationContext  context;
	static{
		 context = new ClassPathXmlApplicationContext("/annoSpring.xml");
	}

	public static void main(String[] args) {
		A a=(A)context.getBean("aaa");
		System.out.println(a);
		context.close();
		
	}

}
