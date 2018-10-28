package demo03.aop;

import org.springframework.stereotype.Component;
//这是一个连接点类
@Component
public class AfHouseOwner{

	public void seekMyHouse() {
		System.out.println("安防房东租房");
//		int i=5/0;
	}

	public void addHouse() {
		System.out.println("房东买了新房");
//		int i=5/0;
	}

	
}
