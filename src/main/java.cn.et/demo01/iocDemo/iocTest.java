package demo01.iocDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class iocTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo01/iocDemo/iocSpring.xml");
        A a =(A) context.getBean("a");
        System.out.println(a.getId());
        System.out.println(a.getName());

        B b =(B) context.getBean("b");
        System.out.println(b.getBname());
        System.out.println(b.getA().getName());

        C c =(C) context.getBean("c");
        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getB().getBname());
    }
}
