package kh.lclass.oop.sample;

import java.io.Serializable;

public class Kh implements TestInterface, Serializable {
	// The serializable class kh does not declare a static final serialVersionUID
	// field of type long
	// static final long serialvarsionUID = 1L; 유니크아이디필요 Serializable 직렬화

	/**
	 * 
	 */
	private static final long serialVersionUID = 4332607456787281223L;

	public void khSpecial() {
		String str = "11111111122222222";
//		int a = Integer.parseInt(str); 
		Car[] carArr = new Car[3];
		try {
			// carArr[0] = new Car();
			carArr[4].setPrice(5000); // ArrayIndexOutOfBoundsException

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터 범위를 벗어났습니다.");
			e.printStackTrace();
		}
		try {
			carArr[0].setPrice(5000); // NullPointException
		} catch (NullPointerException e) {
			System.out.println("예기치 못한 오류 발생하였습니다. 잠시 후 다시 시도해주세요.");
			e.printStackTrace();
		}

		try {
			int a = Integer.parseInt(str); // NumberFormatException
		} catch (

		NumberFormatException e) {
			System.out.println(Integer.MAX_VALUE + "까지의 정수만 입력해주세요");
			e.printStackTrace();
		}try {
			int c = 10 / 0; // 허수 오류발생 //ArithmeticException
			c = 0 / 10;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눈 수는 나타낼 수 없습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}//마지막에 쓴다

		System.out.println("===여기가 마지막===");
	}

	@Override
	public void method1() {

	}

	@Override
	public String method2() {
		return null;
	}

	@Override
	public int method3(int a, int b) {
		return 0;
	}

}
