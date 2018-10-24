package demo02.cycle;

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
