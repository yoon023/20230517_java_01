
class Person {
	String name;
	int age;

	Person() {
		this("이름없음", 1);
	}

	Person(String name1, int age1) {
		this.name = name1;
		this.age = age1;
	}
}

public class ThisEx {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
