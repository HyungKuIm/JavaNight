package lesson6;

public class WrapperTest {

	public static void main(String[] args) {
		int money = 10000;
		Integer money2 = 20000;  // 박싱
		int sum = money + money2; // 언박싱
		System.out.println(sum);

		money2 = null;

		Boolean gender = null;  // 성별은 미정
		boolean gender2 = false;

		if (gender == null) {
			System.out.println("성별은 미정!");
		}

	}

}
