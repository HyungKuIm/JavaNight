package lesson2;

public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = {1,3,5,7,9,10};
		//배열 사용시 범위를 넘어가지 않도록 주의!
//		System.out.println(numbers[4]);
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// foreach문
		for (int num : numbers) {
			System.out.println(num);
		}

		// 다차원 배열
		// 2차원(행렬) = 배열의 배열
//		int[][] matrix = new int[3][4]; // 3 x 4
//		matrix[0][0] = 10;
//		System.out.println(matrix[0][0]);
		int[][] matrix = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};

		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}

		//String 문자열
		String title = "Avatar";
		System.out.println(title);
		//String 메소드
		System.out.println(title.charAt(0));
		System.out.println(title.length());

	}

}







