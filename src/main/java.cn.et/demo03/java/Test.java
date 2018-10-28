package demo03.java;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		//被拦截的房东租房类
		HouseOwer ho=new AfHouseOwner();
		//实现拦截类
		HouseProxy hp=new HouseProxy(ho);
		//中介代理对象
		HouseOwer hproxy=(HouseOwer)Proxy.newProxyInstance(Test.class.getClassLoader(),
				ho.getClass().getInterfaces(), hp);
		hproxy.seekMyHouse();
	}

}
