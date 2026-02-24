package lesson6;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerTest {

	public static void main(String[] args) {
		// 소비자 패턴
		Consumer<String> consumer =
				System.out::println;
				//s -> System.out.println(s);


		consumer.accept("안녕하세요");

		// 공급자 패턴
		Supplier<String> supplier = () -> "안녕하세요";
		System.out.println(supplier.get());

		// 프레디케이트 패턴
		Predicate<Integer> isHotel = n -> n < 100000;
		// 1박 10만 이하이면 호텔 숙박 아니면 벤치행
		if (isHotel.test(110000)) {
			System.out.println("호텔 숙박 가능");
		} else {
			System.out.println("벤치에서 잠");
		}

		// 바이펑션 패턴
		BiFunction<Integer, Integer, Integer> add =
				(x, y) -> x + y;

		System.out.println(add.apply(3, 4));
	}

}





