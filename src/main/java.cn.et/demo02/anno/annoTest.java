package demo02.anno;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annoTest {
	static ConfigurableApplicationContext  context;
	static{
		 context = new ClassPathXmlApplicationContext("/demo02/anno/annoSpring.xml");
	}

	public static void main(String[] args) {
		A a=(A)context.getBean("aaa");
		System.out.println(a);
		context.close();
		
	}

}
