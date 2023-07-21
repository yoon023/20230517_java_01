package kh.lclass.bank;

import java.util.Scanner;

public class Menber {
	public static void main(String[] args) {
		// 스캐너 마련
		java.util.Scanner sc = new Scanner(System.in);
		
		System.out.println("통장계설을 원하십니까?");
		String answer = sc.nextLine();
		if(answer.equals("네")) { //(answer== "네") 문자 == 비교 불가능
			
			System.out.println("주민번호 확인: ");
//			int strNo = sc.nextInt(); sc.nextLine();
			String strNo = sc.nextLine();
			int sno = Integer.parseInt(strNo);
			
			System.out.println("이름 확인: ");
			String strName = sc.nextLine();
			BankAccount ej = new BankAccount(sno, strName);
			BankAccount hj = new BankAccount(123123, "종호", 1023131212);
			
			BankAccount jh = new BankAccount();
			System.out.println(jh.getSno());
			System.out.println(jh.getName());
			System.out.println(jh.getBalance());
			System.out.println(jh.getAccountName());
			jh.sumArgs(2, 5, 3);
			
			jh.sum(1,3);
			jh.sum("11",22);
			jh.sum(1,3,3);
			
			
			String str1 = "문자";
			String str2 = "문자";
			String str3 = new String();
			String str4 = new String("문자");
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3); //null //주소값 //""
			System.out.println(str4);
			
			
			jh.sumArgs();
			
		} else {
			System.out.println("다른 창구 좀 이용해주세요");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
