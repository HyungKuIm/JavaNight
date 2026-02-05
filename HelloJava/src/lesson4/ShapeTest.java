package lesson4;

public class ShapeTest {

	public static void main(String[] args) {
		// 다형성(Polymorphism) 테스트
		// 업캐스팅(부모 변수가 자식 객체를 받을 수 있다)
		Shape shape = new Circle(5);
		shape.showArea();

		shape = new Rectangle(5, 10);
		shape.showArea();

		Circle c = new Circle(10); // 반지름이 10인 원
		Rectangle r = new Rectangle(3, 4); // 너비 3, 높이 4인 사각형

		shape = r;

		// 패턴 매칭
		if (shape instanceof Rectangle r2) {

			r2.showArea();
		} else if (shape instanceof Circle c2) {

			c2.showArea();

		}


	}

}
