package lesson10;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File f1 = new File("FileTest.txt");
		System.out.println(f1.getPath());  // 파일의 경로(상대)
		System.out.println(f1.getAbsolutePath());  // 절대경로
		System.out.println(f1.length()); //파일의 길이(바이트수. 0이면 없거나 아니면 크기가 0)
		System.out.println(f1.exists()); //파일의 존재여부(있으면 true, 없으면 false)

	}

}
