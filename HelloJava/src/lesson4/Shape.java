package lesson4;

public sealed class Shape permits Circle, Rectangle {
	public Shape() {
		System.out.println("도형입니다.");
	}

	public void showArea() {
		System.out.println("도형의 면적은?");
	}
}
