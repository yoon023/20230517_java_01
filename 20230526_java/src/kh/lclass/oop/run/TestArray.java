package kh.lclass.oop.run;

import kh.lclass.oop.sample.Person;
import kh.lclass.oop.sample.Student;

public class TestArray {
	final int a = 10;

	public static void main(String[] args) {
		
		Object obj1 = new Student();
		Object obj2 = new Person();
		Person p1 = new Student();
		Student s1 = new Student();
		//obj1.
		p1.getName();
		s1.getAge();
		
		final int b = 11;
		int n = 0;
		for (final int maxCnt = 5; n < 10; n++) {
			System.out.println("테스트" + n);
		}

		Person[] personArray = new Person[22];
		Person[] personArray2 = new Person[] { new Person(), new Person(), new Person() };
		for (int i = 0; i < personArray.length; i++) {
			personArray[i] = new Person();
		}

		Person[] personArray3 = new Person[22];
		// personArray3[0].setAge(25);
		// NullpointerException
		// 원인 : . 점 앞에 있는 변수(객체=인스턴스)가 null 상태
		// 즉 personArray[0]이 null주소 값을 가지고 있었음
		// 해결방법 : 변수(객체 = 인스턴스)에 뉴 생성자();를해줌
		personArray3[0] = new Person();
		personArray3[0].setAge(25);
		personArray3[0].setName("김소똥");
		personArray3[0].setGender('여');

		personArray3[1] = new Person("김개똥", 19, '남', 5);
		personArray3[2] = new Person("김말똥", 22, '남', 10);
		System.out.println(personArray3[0].getName()); // 김소똥

		System.out.println("====studentArr====");
		Student[] stdArray = new Student[3]; // 배열생성
		for (int i = 0; i < stdArray.length; i++) {
			stdArray[i] = new Student() {
				@Override
				public void setGrade(int grade) {
					System.out.println("학년 "+3); //for 문의 영향력 밖
				}
			};// 객체생성
		}
		stdArray[0].setAge(15);
		stdArray[0].setName("김영희");
		stdArray[0].setGender('여');
		stdArray[0].setScore(85);
		stdArray[0].setGrade(3);
		System.out.println(stdArray[0].getName());
		System.out.println(stdArray[0].getAge());
		System.out.println(stdArray[0].getGender());
		System.out.println(stdArray[0].toString());

		Student yh = new Student("김영희", '여', 20, 1) {
			@Override
			public void setGrade(int grade) {
				System.out.println("학년 지정함 ");
			}

		};
	}

}