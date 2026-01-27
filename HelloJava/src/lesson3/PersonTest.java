package lesson3;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person(); // 사람 1명 생성
		// 사람 인스턴스 생성
		person.setName("강호동");
		person.setAge(30);

		System.out.println("이름:" + person.getName());
		System.out.println("나이:" + person.getAge());

		// 캡슐화(Encapsulation)
		//   : 클래스, 생성자, 접근제어,  메소드, 레코드
		// 상속성(Inheritance)
		//   : 부모, 자식과의 관계, 상속한다는 개념
		// 다형성(PolyMorphism)
		//   : 한 객체가 상황에 따라 여러가지 행동을 가진다
		//     오버로드, 오버라이드, 추상클래스, 인스턴스

	}

}
