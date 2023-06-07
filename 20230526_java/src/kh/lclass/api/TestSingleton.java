package kh.lclass.api;

public class TestSingleton { //캘린더 리소스 큰 애들 
	private int a = 10;
	private static TestSingleton instance = new TestSingleton();
	
	private TestSingleton() {}
	
	public static TestSingleton getInstance() {
		return instance;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	
	
}
