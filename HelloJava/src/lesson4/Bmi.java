package lesson4;

public record Bmi(double height, double weight) {

	public void showBmi() {
		// 몸무게 / 키의 제곱
		// 단 키는 미터 단위
		double m_height = height * 0.01;  // 미터 키
		double bmi = weight / (m_height * m_height);
		System.out.println("bmi = " + bmi);
	}

}
