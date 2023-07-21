package com.kh.practice1_func;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		// 스캐너 가져다가 전원버튼 누름
			Scanner scan = new Scanner(System.in);
			
			// enter key 눌릴 때까지의 데이터를 스캔해줘
			// 1 2 가 나 다 enter 
			// scan은 데이터 "11 22 33 가가가  나나 다 \n\0"
			String str1 = scan.next(); //띄어쓰기 또는 엔터 전까지 한덩어리 문자형태로 리턴 
			scan.nextLine(); 
			System.out.println(str1);
			//11
			int num1 = scan.nextInt();    // 띄어쓰기 또는 엔터  전까지 한덩어리를 정수로 바꿔서 리턴 
			scan.nextLine(); 
			System.out.println(num1);//22
			double num2 = scan.nextDouble(); // 띄어쓰기 또는 엔터 전까지 한덩어리를 실수로 바꿔서 리턴
			scan.nextLine(); 
			System.out.println(num2);//33.3
			
			String str2 = scan.nextLine();   //줄바꿈 까지 한덩어리를 문자형태로 바꿔서 리턴 엔터도 문자
			System.out.println(str2);//가가가 나나 다 \n
			
			System.out.println("입력1");
			int num3 = scan.nextInt();
			scan.nextLine(); //flush()
			System.out.println(num3);

			System.out.println("입력2");
			String str3 = scan.nextLine();
			System.out.println(str3);
			
			System.out.println("끝");
			scan.close();
	}

}
