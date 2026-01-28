package lesson4;

public final class Circle extends Shape{
	public Circle() {
		System.out.println("원입니다.");
	}

	public Circle(double r) {
		this.radius = r;
	}

	public void showArea() {
		System.out.println(Math.PI * this.radius * this.radius);
	}

	private double radius;
}
