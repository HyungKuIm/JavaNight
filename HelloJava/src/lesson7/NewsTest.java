package lesson7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class NewsTest {

	public static void main(String[] args) {
		try {
			FileInputStream is =
					new FileInputStream("C:\\Users\\A\\Documents\\news.txt");
			InputStreamReader reader =
					new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(reader);
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
			reader.close();
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
