package lesson2;

public class While2 {

	public static void main(String[] args) {
		// While 무한 반복
		int count = 1000;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
		System.out.println(count);
		count = 1000;
		// 최소 1회 보장!
		do {
			System.out.println(count);
			count++;
		} while (count <= 10);

		//for문
		for (int i = 1; i<=10; i++) {
			System.out.println("아바타 " + i);
		}

	}

}
