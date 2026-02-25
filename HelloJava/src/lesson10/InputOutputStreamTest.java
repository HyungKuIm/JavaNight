package lesson10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputStreamTest {

	public static void main(String[] args) throws IOException{
		int ch;
		InputStream in = System.in;
		OutputStream out = System.out;
		while ((ch=in.read()) != -1) {  // 입력한 문자가 EOF(EOS)가 아니면
			//이클립스에서는 종료 버튼으로 종료
			// Ctrl + C => 정상 스트림 종료
//			if (ch == 'S') {
//				System.exit(-1);  // 프로그램 종료
//			}
			System.out.print((char)ch);
		}

		out.flush();
		out.close();
		in.close();
	}

}
