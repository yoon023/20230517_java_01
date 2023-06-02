package kh.lclass.oop.sample;

//class 예약키워드 abstract는 해당 클랜스 내에 abstract 메소드가 0개 이상 있을 것이라는 것을 의미함.
public class Student extends Person {
	private String name; //학생증용이름
	//private int age;
	//private char gender;
	private int score;
	private int grade;
	private final int maxCount = 10;
	
	
	public int getMaxCount() {
		return maxCount;
	}
	
	public Student() {
		super(); //person() Person에 기본생성자없으면 오류 
		//super("김말똥",22,'남');
	}
	public Student(String name, char gender, int age, int grade) {
		super(name, age, gender,10);
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", grade=" + grade + ", toString()=" + super.toString()
				+ "]";
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	@Override // Overriding 골뱅이마크 어노테이션 
	//재정의 -
	//조건 
	//상속 상속한 클래스의 메소드와 동일한 메소드명
	//매개변수 자료형 동일, 개수 동일 
	//리턴 타입 동일 
	//단 접근제한자는 달라도 됨. //부모 메소드 접근제한자보다 넓은 범위의 접근제한자를 사용해야한다
	
	public int getAge() {
		return super.getAge()+1;
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getGrade() {
		return grade;
	}
	
	//변수 선언
	//메소드 정의//이 기능은 이런이런 기능으로 되어있어.
	//The abstract method setGrade in type Student can only be defined by an abstract class
	//메소드 선언 //이 기능이 있을거야 있어야 해 
	public  void setGrade(int grade){
		this.grade = grade;
	}

	//public void setName(String name) {
	//	this.name = name;
	//}
	
}
