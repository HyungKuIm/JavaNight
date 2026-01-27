package lesson3;

import java.text.MessageFormat;

public class StringTest2 {

	public static void main(String[] args) {
		String poem = "나보기가 역겨워\n"
				+ "가실 때에는";
		System.out.println(poem);

		String poem2 = """
				나보기가 역겨워
				가실때에는
				""";
		System.out.println(poem2);

		String wedding = MessageFormat.format("""
					시간: {0}
					장소: {1}
				""", "2026/01/31", "구로 호텔");
		System.out.println(wedding);

	}

}
