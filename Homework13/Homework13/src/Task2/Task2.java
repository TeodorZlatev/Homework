package Task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
	public static void main(String[] args) {
		BufferedReader input = null;
		try {
			input = new BufferedReader(new FileReader("task2.txt"));
			String line;
			Pattern pattern = Pattern.compile("(\\w+@\\w+.\\w+)");
			System.out.println("E-mails, founded in the file:");
			while ((line = input.readLine()) != null) {
				Matcher matcher = pattern.matcher(line);
				while (matcher.find()) {
					System.out.println(matcher.group(1));
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �� ���� �� �� ������ ..");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}