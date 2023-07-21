package kh.lclass.bank;

public class BankAccount { 

	//setter 있으면 안됨
	private static int count; //현재 이 통장을 계설한 사람 수
	public int getCount() {
		return count;
	}
	protected void setCount(int count) {
		BankAccount.count = count;
	}
	private int accountNo; // 계좌번호
	private String name; // 예금주
	private Integer sno = null; // 주민번호
	
	private String accountName="내일배움"; // 통장이름
	private Infomation info; // 유의사항
	private int balance; // 잔액
	private int password; // 비밀번호
	
	{
		accountName = "내일배움-블럭초기화";
		balance = 5000000;
		
	}
	
	// 생성자 클래명과 동일, 리턴타입없음.
	public BankAccount() {
		accountName = "내일배움생성";
	}
	public BankAccount(Integer sno, String name) {
		this.sno = sno;
		this.name = name;
	}	

	public BankAccount(Integer sno, String name, int phonenumber) {
		this.accountNo = phonenumber;
		this.sno = sno;
		this.name = name;
	}
	
	public BankAccount(int accountNo, String name, Integer sno, String accountName, int password) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.sno = sno;
		this.accountName = accountName;
		this.password = password;
	}
	//overloading 오버로딩 조건 : 매개변수 개수, 자료형이 다르고 메소드 명이 같을떄
	public double sum(double a,double b) {
		return a+b;
	}
	public double sum(double c, int b) {
		return c+b;
	}
//	public double sum(int a, int b) {
//		return a+b;
//	}
	public int sum(int a,int b) {
		return a+b;
	}
	public int sum(int a ,int b, int c) {
		return a+b+c;
	}
	public int sum(String a, int b) {
		return Integer.parseInt(a)+b;
	}
	public int sumArgs(int ... args) {
		int result = 0;
		for(int a : args ) {
			System.out.println(a);
			result += a;

		}
		System.out.println("합은 "+result);
		// 가변인자 예
		System.out.printf("printf는 %가변 [%.2f] 인자 %d 사용 %d %c %s" , 1, 3.5, 2000000000000L, 'c', "문자열도 가능");
		return result;
	}
		
		
		
	
	
	// getter / setter 게터/세터
	// alt + shift + s 창 source
	
	
	// 메소드정의 =기능정의
	// 입금 --- 출처(source), 금액(inputmoney) 준다면 - balance에 금액만큼 더하고 - 최종 balance 를 화면
	// 표시함
	// 출금 --- 목적지(destination), 금액(outputmoney) 준다면 - balance에 금액만큼 빼고 - 최종 balance
	// 를 화면 표시함
	// 비번확인 --- 입력한 패스워드(inputpassword)와 - password를 비교하여 같다면 true, 다르면 false를 표시함
	// 잔앧조회
	// 입출금내역조회
	// 입금 --- 출처(source), 금액(inputmony) 준다면 - balance에 금액만큼 더하고 - 최종 balance 를 화면
	// 표시함



	
	public String deposit(String source, int inputMoney) {
		System.out.println(source + "으로 부터 " + inputMoney + "만큼 입금되었습니다");
		double interate = 0.05;
		balance = balance + inputMoney;
		interate = 5;
		return "입금 후 잔액은" + balance + "입니다";
		
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
	public Integer getSno() {
		return sno;
	}
	public String getAccountName() {
		return accountName;
	}
	public Infomation getInfo() {
		return info;
	}
	public int getBalance() {
		return balance;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public void setInfo(Infomation info) {
		this.info = info;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override //오브젝트에 있지만 다시 정의 @어노테이션 
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", name=" + name + ", accountName=" + accountName + ", balance="
				+ balance + "]";
	}
	
	
}
	
	

// 생성자메소드
// 그냥메소드