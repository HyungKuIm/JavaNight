package lesson5;

public class ShipTest {

	public static void main(String[] args) {
		Ship2 ship = new Titanic();
		System.out.println("타이나틱 탑승객수:" + ship.move());
		System.out.println("타이타닉 짐 총량(kg):" + Ship2.carry());

	}

}
