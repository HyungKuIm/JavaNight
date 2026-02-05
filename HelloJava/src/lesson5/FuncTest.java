package lesson5;

import java.util.function.Function;

public class FuncTest {

	public static void main(String[] args) {
		//펑션: 하나의 인수, 하나의 결과
		// 미국여행: 1인당 10불짜리 식사 2명
		Function<Integer, Integer> multiBy2 = x -> x * 2;
		System.out.println("총 식비:" + multiBy2.apply(10));
		// 20불 -> 팁 4불
		Function<Integer, Integer> add4 = x -> x + 4;
		System.out.println("팁 포함 금액: " + add4.apply(20));

		Function<Integer, Integer> combined2 =
				multiBy2.andThen(add4);
		System.out.println(combined2.apply(10));

	}

}
