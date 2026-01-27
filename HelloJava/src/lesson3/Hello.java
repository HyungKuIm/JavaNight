package lesson3;

public class Hello {

	public static void main(String[] args) {
		// 변수와 상수
		// 공통점: 메모리를 차지
		final int i = 100;  // 일단 한번 쓰면 더이상 쓸수없는 상수
		//i = -1;
		System.out.println(i);

		String name = "오라클자바";
		name += "학원";
		System.out.println(name);

		// String보다 효율적
		StringBuffer nameBuffer = new StringBuffer("오라클자바");
		nameBuffer.append("학원");
		System.out.println(nameBuffer);

		// StringBuffer보다 효율적
		StringBuilder nameBuilder = new StringBuilder("오라클자바");
		nameBuilder.append("학원");
		System.out.println(nameBuilder);

	}

}
