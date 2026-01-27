package lesson3;

public class StringTest {

	public static void main(String[] args) {
		String name1 = "강호동";
		String name2 = "강호동";

		// 문자열 비교
		// compare : 정확하기 일치(모든 문자 비교)
		// compareIgnoreCase : 대소문자 제외
		// compareTo: 대소 비교(양수, 음수, 0)
		if (name1.equals(name2)) {
		//if (name1 == name2) {  // 안되는 코드(주소 비교)
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}

		// substring
		String s = name1.substring(1, 3);  // 호동
		String s2 = name1.substring(1);  // 호동
		System.out.println(s);
		System.out.println(s2);

		String s3 = "850201-1234567";
		//주민번호 뒷자리만 출력
		String s4 = s3.substring(7);
		System.out.println(s4);

		String gender = s3.substring(7, 8);
		System.out.println(gender);

		if (gender.equals("1")) {
			System.out.println("당신은 2000년대 이전의 남자");
		} else {
			System.out.println("당신은 여자 아니면 2000년대 이후 남자, 아니면 외국인");
		}

		String num = String.valueOf(1000);
		System.out.println(num + "원");

	}

}
