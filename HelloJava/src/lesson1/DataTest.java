package lesson1;

public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;  // a는 변수(Variable)
		a = 20; // a와 20이 같다는 뜻이 아니라 20을 a에 대입
		System.out.println("a = " + a);

		short b = -10000;
		System.out.println("b = " + b);

		var c = 1;  // 속도가 매우 빠름!
		System.out.println("c = " + c);

		var d = 1000L;  // 크기는 가장 크지만, int보다 큰 정수를 담고 싶을때
		System.out.println("d = " + d);

		//float, double
		// var는 대입하는 값이 명확할 경우 사용 적극 추천!
		var e = 1.1f;  // 32비트 실수
		System.out.println("e = " + e);

		var f = 1.1111; // 64비트 실수 (왠만하면 double 씀)
		System.out.println("f = " + f);

		var g = '강';  // 2바이트 문자
		System.out.println(g);

		var h = false; // 참 거짓만을 다루는 타입(4바이트)
		System.out.println(h);
	}

}
