package lesson7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<String> movies =
				Arrays.asList("서울의 봄", "남산의 부장들", "돈",
							"공동경비구역 JSA222222", "하얼빈");
		// ① 스트림 생성
		Stream<String> stream = movies.stream();
//		// ② 중간단계 스트림(결과도 스트림)
//		Stream<String> midStream = stream.filter(name -> name.length() > 3)
//									.map(n -> n + " 봄")
//									.sorted();
//		// ③ 최종처리
//		List<String> result = midStream.collect(Collectors.toList());
//
//		for (String m : result) {
//			System.out.println(m);
//		}
		// 서울로 시작하는 영화
		Optional<String> first =
				stream.filter(name -> name.startsWith("서울")).findFirst();

		if (!first.isEmpty()) {
			System.out.println(first.get());
		} else {
			System.out.println("서울로 시작하는 영화는 없습니다.");
		}

		System.out.println(first.orElse("서울로 시작하는 영화는 없습니다."));

		stream = movies.stream();

		boolean anyMatch = stream.anyMatch(name -> name.length() > 10);
		System.out.println("10자 이상 영화가 있는지:" + anyMatch);


	}

}
