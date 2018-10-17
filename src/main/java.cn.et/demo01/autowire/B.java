package demo01.autowire;

public class B {
	private A a;
	private String name;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
