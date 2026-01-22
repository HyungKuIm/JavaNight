package lesson2;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("키 입력?");
		var height = scan.nextDouble();
		//height = height / 100; // cm => m
		height /= 100;
		System.out.print("몸무게 입력?");
		var weight = scan.nextDouble();
		var bmi = weight / (height * height);
		System.out.println("체질량 지수:" + bmi);


	}

}
