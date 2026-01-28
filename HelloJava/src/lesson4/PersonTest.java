package lesson4;

public class PersonTest {

	public static void main(String[] args) {
		//강호동, 30, kang@naver.com
		Person person = new Person("강호동", 30, "kang@naver.com");
		System.out.println(person.name());
		System.out.println(person.age());
		System.out.println(person.email());

	}

}
