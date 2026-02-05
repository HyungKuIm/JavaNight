package lesson5;

public interface Ship2 {
	//int move();  // 사람을 몇몇 나르는가?
	default int move() {
		return 4;
	}
	//int carry();  // 짐을 몇kg 나르는가?
	//정적 메소드 Ship2.carry
	static int carry() {
		return 10;
	}
}
