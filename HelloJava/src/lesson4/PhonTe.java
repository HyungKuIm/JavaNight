package lesson4;

import java.util.Scanner;

public class PhonTe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("폰 이름:");
		String name = scan.nextLine();
		System.out.print("출고가:");
		int price = scan.nextInt();
		System.out.print("할부 개월수:");
		int hal = scan.nextInt();
		System.out.print("할부 수수료:");
		double fee = scan.nextDouble();

		Phone phone = new Phone(name, price, hal, fee);
		System.out.println("폰 이름:" + phone.name());
		System.out.println("출고가:" + phone.price());
		System.out.println("할부 개월수:" + phone.hal());
		System.out.println("할부 수수료:" + phone.fee());
		phone.showMonthMoney();

	}

}
