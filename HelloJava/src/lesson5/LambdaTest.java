package lesson5;

public class LambdaTest {

	public static void main(String[] args) {
		// 한달에 휴대폰값이 2000원이고 통신비가 10000원이면
		// 총 납부금액은?
		Processor process = (int a, int b) -> a + b;
		int phonePrice = 2000;
		int commPrice = 10000;
		System.out.println("총 납부금액:" +
		    process.process(phonePrice, commPrice));

		// 철수가 사과를 10개를 샀는데, 오다가 2개를 먹었다면 몇개가 남는가?
		Processor process2 = (int a, int b) -> a - b;
		int apple = 10;
		int eat = 2;
		System.out.println("사과 남은 갯수는 " +
				process2.process(apple, eat));


	}

}
