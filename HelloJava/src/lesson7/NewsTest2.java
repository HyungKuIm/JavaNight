package lesson7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewsTest2 {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\A\\Documents\\news.txt");

		try(BufferedReader reader =
				Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			for (String line; (line = reader.readLine()) != null;) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println(ex);
		}

	}

}
