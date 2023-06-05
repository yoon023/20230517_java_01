package kh.lclass.oop.sample;

import java.io.Serializable;

public class Person implements Serializable {	
	/** 
	 *  주석은 일반적으로 녹색
	 *  이것은 파랑색
	 *  java docs에 표시됨.
	 *  여기에 UID 생성날짜, 누가, 무엇때문에 작성하였는지를 남겨야 함.
	 */
	private static final long serialVersionUID = 6655830439833572939L;
	private String name;//주민등록증이름
	private int age; //만 
	private transient char gender; // 'M'/'F'
	
	
	//기본생성자 
	/*녹색*/
	/**파랑색 작성위치 여기*/
	public Person() {
	}
	public Person(String name, int age, char gender, final int maxCnt) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;  //만나이계산법
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	

	//allargumentsConstructor 만들어주세요.
	//allargumentsConstructor란 모든 매개인자를 받아서 처리하는 생성자.
	//오버로딩으로 생성자
	//getter / setter
		
}
