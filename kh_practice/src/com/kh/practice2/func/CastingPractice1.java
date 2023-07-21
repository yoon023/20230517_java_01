package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void method1() {
		System.out.println("여기 실행됨 여기로 코딩함");
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 하나를 입력하세요.");
		char ch1 = sc.nextLine().charAt(0);
		System.out.println((int)ch1);
	}
}
