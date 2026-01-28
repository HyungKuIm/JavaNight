package lesson4;

public record Phone(
			String name,
			int price,
			int hal,
			double fee
		) {
	public void showMonthMoney() {
		double monthMoney =
				price / hal + (price * fee / 100) / 12;
		System.out.println("매월 할부금:" + monthMoney);
	}
}
