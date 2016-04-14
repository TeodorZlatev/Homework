package Task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileNameInput = "namesIn.txt";
		String fileNameOutput = "namesOut.txt";
		BufferedReader input = null;
		PrintWriter output = null;
		TreeSet<String> names = new TreeSet<String>();
		try {
			input = new BufferedReader(new FileReader(fileNameInput));
			output = new PrintWriter(new FileWriter(fileNameOutput));
			System.out.println("Файлът \"" + fileNameInput + "\" е отворен за четене.");
			String tmp;
			while ((tmp = input.readLine()) != null) {
				names.add(tmp);
			}
			for (String name : names) {
				output.println(name);
			}
			System.out.println("Данните от \"" + fileNameInput + "\" са прочетени и са записани сортирани в \""
					+ fileNameOutput + "\".");
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			System.out.println("Файлът \"" + fileNameInput + "\" не успя да се отвори ..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (output != null) {
				output.close();
			}
		}

	}

}
