package demo02.cycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class cycleTest {
	static ConfigurableApplicationContext  context;
	static{
		 context = new ClassPathXmlApplicationContext("/cycleSpring.xml");
	}
	//在main方法执行的时候开始 在调用close方法时结束
	public static void main(String[] args) {
		context.close();
	}

}
