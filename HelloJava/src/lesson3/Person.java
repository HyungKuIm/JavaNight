package lesson3;

//클래스(틀)
public class Person {
	private String name;
	private int age;

	public Person() {
		name = "홍길동";
		age = 20;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
