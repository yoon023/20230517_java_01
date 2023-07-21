package constructor;


public class PersonTest {
	public static void main(String[] args) {
		Person personLee = new Person();
		personLee.name ="이순신";
		personLee.height = 185.5F;
		personLee.weight = 85.5F;
		Person personkim = new Person("김유신",185,70);
		System.out.println(personkim.height+personkim.name);

}

	
}
