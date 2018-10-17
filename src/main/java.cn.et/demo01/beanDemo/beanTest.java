package demo01.beanDemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanTest {
	public static void main(String[] args) {
//		FileSystemXmlApplicationContext 从文件系统下寻找xml文件 带盘符
//		ClassPathXmlApplicationContext  从类路径下寻找
//		GenericXmlApplicationContext    通用 默认查找类路径
//		WebApplicationContext web.xml中实例化
		//容器对象
		ApplicationContext context =new ClassPathXmlApplicationContext("beanSpring.xml");  //从类路径找文件

		A a =(A) context.getBean("a1");
		System.out.println(a);
	}
}
