package demo01.prototype;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class prototypeTest {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("demo01/prototype/prototypeSpring.xml");
		A a =(A)context.getBean("a");
		A a1 =(A)context.getBean("a");
		System.out.println(a==a1);
		
	
		
		
	}
}
