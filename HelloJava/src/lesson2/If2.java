package lesson2;

public class If2 {

	public static void main(String[] args) {
		int num = 100000;
		if (num >= 10000) {
			System.out.println("당신은 부자!");
		} else if (num >= 3000) {
			//3000이상 1억 미만
			System.out.println("당신은 중산층!");
		} else {
			//3000미만
			System.out.println("당신은 서민!");
		}

		if (num >= 10000) {
			System.out.println("당신은 부자!!");
		}

		if (num >= 20000) {
			System.out.println("당신은 갑부!!");
		}

		int num2 = 10;
		System.out.println(num2 >= 100 ? "부자" : "서민");

		if (num >= 100 || num2 >= 100) {
			System.out.println("사랑합니다!");
		}

		if (!(num2 >= 100)) {
			System.out.println("행복하세요~");
		}

		// Switch Test
		String name = "심형래";
		switch (name) {
		case "홍길동":  // name == "홍길동"
			System.out.println("홍길동님 안녕하세요~");
			break;
		case "심청":
			System.out.println("효녀이시군요^^");
			break;
		default:
			System.out.println("누구세요");
		}

	}

}







