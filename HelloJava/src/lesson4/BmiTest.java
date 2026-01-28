package lesson4;

import java.util.Scanner;

public class BmiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("키 입력:");
		double height = scan.nextDouble();
		System.out.print("몸무게 입력:");
		double weight = scan.nextDouble();

		// Bmi 인스턴스 생성!
		Bmi bmi = new Bmi(height, weight);
		System.out.println("키:" + bmi.height());
		System.out.println("몸무게:" + bmi.weight());
		bmi.showBmi();

	}

}
