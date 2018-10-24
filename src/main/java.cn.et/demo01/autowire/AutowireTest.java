package demo01.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo01/autowire/autowireSpring.xml");
        B b =(B) context.getBean("b");
        System.out.println(b.getA().getName());
    }
}
