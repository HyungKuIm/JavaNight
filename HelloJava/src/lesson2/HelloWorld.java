package lesson2;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// 두수를 입력받아 곱을 구하는 프로그램
		// 123 * 346 = ?
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수 입력?");  // 커서가 바로 뒤로 감
		var num1 = scan.nextDouble();
		System.out.print("두번째 수 입력?");
		var num2 = scan.nextDouble();
		System.out.println("입력하신 두수의 곱은");
		var result = num1 * num2;
		System.out.println(result + "입니다.");

	}

}
