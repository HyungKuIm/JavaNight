package lesson5;

public class SportsTest {

	public static void main(String[] args) {
		Sport<String> sport = new Hanwha();
		sport.intro("와이스");

		Sport<Integer> sport2 = new Kia();
		sport2.intro(5);

	}

}
