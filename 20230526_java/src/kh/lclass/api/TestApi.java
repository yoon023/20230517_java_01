package kh.lclass.api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

import kh.lclass.vo.TestVo;
import static kh.lclass.api.KhCommonApi.checkMenu;


public class TestApi {
	public void testDate() {
		Date when = new Date(2000L);
		//대부분 deprecated 되어있음.
		System.out.println(when);
		//Cannot instantiate the type Calendar
		//abstract
		//생성자 접근제한자 프로텍티드
		//new Calendar() 오류
		//해결 1
		Calendar c = new GregorianCalendar();
		// 해결 2 - Singleton - 디자인패턴 중 하나 
		Calendar c2 = Calendar.getInstance(); 
		
		TestSingleton ts = TestSingleton.getInstance();
		System.out.println(ts.getA());
		ts.setA(50);
		System.out.println(ts.getA());
		
		TestSingleton ts2 = TestSingleton.getInstance();
		System.out.println(ts2.getA());
		ts.setA(100);
		System.out.println(ts2.getA());
		
		System.out.println(c.getTime());
		
	}
	public void testWrapperDoWhile() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("메뉴 1-5 사이 선택해주세요.");
			int menu = 0;

			try {
				String menuStr = sc.nextLine();
				menu = Integer.parseInt(menuStr);
			} catch (NumberFormatException e) {
				// NumberFormatException:
				// 생략해도 됨 e.printStackTrace(); 안씀
			}
			if(!checkMenu(1, 5, menu)) {
				continue;
			}
		
			// 정상입력경우
			System.out.println("정상적으로 입력되어서 ... 다른 함수 호출함");
			testString();
			System.out.println("동작 마침!!!");
			break;
		}
	}

	
//		while (true) {
//
//			System.out.println("메뉴 1-5 사이 선택해주세요.");
//			int menu = 0;
//			
//			try {
//				menu = sc.nextInt();
//			} catch (InputMismatchException e) {
//				// InputMismatchException
//				sc.nextLine();
//			}
//			if (menu < 1 || menu > 5) {
//				// 비정상 입력경우 경고문구 하나에 이동
//				System.out.println("1-5사이 선택해주세요.");
//				continue;
//			}
//			// 정상입력경우
//			System.out.println("정상적으로 입력되어서 ... 다른 함수 호출함");
//			testString();
//			System.out.println("동작 마침!!!");
//			break;
//			
//		}
//		System.out.println("testWrapperDoWhile 끝");
		
	
//	while (true) {
//
//		System.out.println("메뉴 1-5 사이 선택해주세요.");
//		int menu = sc.nextInt();
//
//		if (menu > 0 && menu < 6) {
//			// 정상입력경우
//			System.out.println("정상적으로 입력되어서 ... 다른 함수 호출함");
//			testString();
//			System.out.println("동작 마침!!!");
//			break;
//		} else {
//			// 비정상 입력경우
//			System.out.println("1-5사이 선택해주세요.");
//		}
	public void testString() {
		StringBuffer str1 = new StringBuffer("aaa");
		StringBuffer str2 = new StringBuffer();
		str2.append("12345");
		str2.insert(2, "abc");
		System.out.println(str2);
		System.out.println(str2.indexOf("bc"));
		StringBuilder str3 = new StringBuilder("bbb");
		str3.insert(1, "111");
		System.out.println(str3);

		Scanner sc = new Scanner(System.in);
		System.out.println("구분자를 입력해주세요.");
		String token = sc.nextLine();
		System.out.println("내용을 입력해주세요.");
		String content = sc.nextLine();
		String str = "A| |A|BB|C|C";
		StringTokenizer st = new StringTokenizer(content, token);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st);

		// 기본자료형 --> String;
		int i = 35;
		double d = 35.0;
		String s1 = String.valueOf(d);
		String s2 = Double.valueOf(d).toString();

		// String --> 기본자료형
		// NumberFormatException : For input String s : "35.251";
		// i = Integer.parseInt(s);
		System.out.println(i);

		System.out.println("==== 끝 ====");

		System.out.println(35);
		System.out.println(35 + ":"); // 연결자 문자열

	}
}
