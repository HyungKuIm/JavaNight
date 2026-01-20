package lesson1;

import java.util.Scanner;

public class HelloWorld2 {

	public static void main(String[] args) {
		//사용자로부터 좋아하는 숫자 하나를 입력받아 그 숫자를 출력
		Scanner scan = new Scanner(System.in);  // 키보드
		System.out.println("좋아하는 숫자 하나를 입력하세요");
		var number = scan.nextLine();
		System.out.println("입력하신 숫자는 " + number);

	}

}
