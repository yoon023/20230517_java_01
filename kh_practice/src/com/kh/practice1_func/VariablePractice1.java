package com.kh.practice1_func;

import java.util.Scanner;

import com.kh.practice1.run.*;

public class VariablePractice1 {
	public void method1() {
		System.out.println("여기 실행됨 여기로 코딩함");
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("성별을 입력하세요(남/여) : ");
		
		char gender = sc.nextLine().charAt(0);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요(cm) : ");
		
		double height = sc.nextDouble();
		System.out.println("키"+height + "cm인" +age + "살 " + gender +" "+ name +"님 반갑습니다^^");
		
		
		
		//이름을 입력하세요 : 아무개
		//성별을 입력하세요(남/여) : 남
		//나이를 입력하세요 : 20
		//키를 입력하세요(cm) : 180.5

		//키 180.5cm인 20살 남자 아무개님 반갑습니다^^
	}
	
	public void method2() {
		System.out.println("여기 2 실행 됨 ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.println("더하기 결과 : " + (num1+num2) );
		System.out.println(" 빼기 결과 : " + (num1- num2) );
		System.out.println(" 곱하기 결과 : " + (num1*num2) );
		System.out.println(" 나누기 몫 결과 : " + (num1/num2) );
		
		
		
	}
	public void method3() {
		System.out.println("여기 3 실행됨");
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 : ");
		int number3 = sc.nextInt();
		System.out.println("세로 : ");
		int number4 = sc.nextInt();
		System.out.println("면적 : " + (number3*number4) );
		System.out.println("둘레 : " + (number3+number4)*2 );
		
	}
	
	public void method4() {
		System.out.println("여기 4 실행됨");
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
	    String ch1 = sc.nextLine();
		System.out.println("첫 번째 문자 :  " + ch1.charAt(0));
		System.out.println("첫 번째 문자 :  " + ch1.charAt(1));
		System.out.println("첫 번째 문자 :  " + ch1.charAt(2));
		
		
		sc.close();
	
}
}
