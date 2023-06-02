package kh.lclass.oop.sample;

import java.io.Serializable;


public class Kh  implements TestInterface, Serializable {
	//The serializable class kh does not declare a static final serialVersionUID field of type long
	//static final long serialvarsionUID = 1L; 유니크아이디필요 Serializable 직렬화 
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4332607456787281223L;
	public void khSpecial() {
		
	}
	
	
	@Override
	public  void method1() {
		
	}
	@Override
	public  String method2() {
		return null;
	}
	@Override
	public  int method3(int a, int b) {
		return 0;
	}
	
}
