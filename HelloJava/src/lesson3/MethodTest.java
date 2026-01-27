package lesson3;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		// 메인 메소드
		// 프로그램의 시작과 끝
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력:");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 입력:");
		int num2 = scan.nextInt();
		int hap = sum(num1, num2);  // num1, num2는 인수(argument)
		System.out.println("합은 " + hap);
	}

	public static int sum(int a, int b) {  // 매개변수(Parameter)
		return a + b;
	}

}
