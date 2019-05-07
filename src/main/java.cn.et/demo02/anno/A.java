package demo02.anno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * <bean id="a"  class="demo02.anno.A" init-method="ini" destroy-method="des">
 </bean>

 注解@Component 让spring容器 自动实例化当前类
 id=类名首字母小写

 @Controller 一般用于控制层
 @Service    用于业务逻辑层
 @Repository  用来描述持久层
  * @author Administrator
 *
 */

@Component("aaa")
public class A {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 容器创建bean之后调用
	 */
	public void ini(){
		System.out.println("init");
	}

	/**
	 * 容器销毁bean时 调用
	 */
	public void des(){
		System.out.println("destroy");
	}
	
}
