package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void method2() {
		System.out.println("여기 실행됨 여기로 코딩함");
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 과목의 점수를 입력하세요.");	
		int score1 = sc.nextInt();
		System.out.println(score1);
		System.out.println("영어 과목의 점수를 입력하세요.");	
		int score2 = sc.nextInt();
		System.out.println(score2);
		System.out.println("수학 과목의 점수를 입력하세요.");	
		int score3 = sc.nextInt();
		System.out.println(score3);
		System.out.println("총점 : " + (score1 + score2 + score3));
		System.out.println("평균 : " + (score1 + score2 + score3)/3);
		
	}
}
