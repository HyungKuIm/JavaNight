package lesson4;

public final class Rectangle extends Shape {

	private double w;  // 가로(width)
	private double h;  // 세로(height)

	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}

	// 오버라이드(재정의)
	//  주의할 점! : 부모의 메소드와 정확하게 일치(한글자라도 틀리면 안됨!!)
	@Override
	public void showArea() {
		double area = w * h;
		System.out.println("사각형의 면적? " + area);
	}

}
