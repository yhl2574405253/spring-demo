package demo02.cycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class cycleTest {
	static ConfigurableApplicationContext  context;
	static{
		 context = new ClassPathXmlApplicationContext("/demo02/cycle/cycleSpring.xml");
	}
	//在main方法执行的时候开始 在调用close方法时结束
	public static void main(String[] args) {
		context.close();
	}

}
