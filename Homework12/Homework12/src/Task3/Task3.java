package Task3;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class Task3 {
	// �������� ��������, ����� ������� ������ �� ���� �� ����, �������
	// words.txt, ���������
	// ����� ���� ����� ��
	// ���� ���� �� ����� � ���� ���� text.txt � ������� ��������� � ����� ����
	// � result.txt,
	// ���� ����� ���� �� ������� �� ���� �� ������� � ��������� ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileNameInput = "words.txt";
		String fileNameComparation = "text.txt";
		String fileNameOutput = "result.txt";
		BufferedReader input = null;
		BufferedReader comparation = null;
		PrintWriter output = null;
		TreeSet<String> words = new TreeSet<String>();
		HashMap<String, Integer> wordsCounted = new HashMap();

		try {
			input = new BufferedReader(new FileReader(fileNameInput));
			comparation = new BufferedReader(new FileReader(fileNameComparation));
			output = new PrintWriter(new FileWriter(fileNameOutput));
			String line;

			// ������ � ��������� � TreeSet �� ������ �� words
			while ((line = input.readLine()) != null) {
				// ��������� �� ������
				String[] wordsTmp = line.split("[^a-zA-Z�-��-�]+");
				// ���������
				for (String word : wordsTmp) {
					words.add(word);
				}
			}
			// ������ �� text.txt
			while ((line = comparation.readLine()) != null) {
				String[] wordsTmp = line.split("[^a-zA-Z�-��-�]+");
				// ��������� �� ������ � ������� ��� � text.txt
				for (String wordTmp : wordsTmp) {
					// ��������� �� ������ � TreeSet (words.txt)
					for (String word : words) {
						// ��� ������������ �� ���� �� words.txt
						// � ���� �� text.txt, �������� �� ������ �
						// TreeMap ��� ����������� �� ���������� �,
						// ��� ���� ����������
						if (word.equalsIgnoreCase(wordTmp)) {
							if (wordsCounted.containsKey(word)) {
								wordsCounted.put(word, wordsCounted.get(word) + 1);
							} else {
								wordsCounted.put(word, 1);
							}
						}
					}
				}
			}
			// ����������� �� ������ � ������� ��������� � ArrayList �� Entry,
			// ��� ���� Collections.sort() � Comparator ���� ���������
			// ������ � List, �� �� � � Map
			ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>();
			for (Entry<String, Integer> entry : wordsCounted.entrySet()) {
				list.add(entry);
			}

			Collections.sort(list, Comparators.DESCENDING_COUNT);
			output.println("������, �������� ��� �����, ��������� � �������� ���.");
			writeIntoFile(output, list);

			Collections.sort(list, Comparators.ASCENDING_COUNT);
			output.println();
			output.println("������, �������� ��� �����, ��������� ��� �������� ���.");
			writeIntoFile(output, list);

		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (comparation != null) {
				try {
					comparation.close();
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

	public static void writeIntoFile(PrintWriter out, ArrayList<Entry<String, Integer>> list) {
		out.println(String.format("%-10s| %s", "�������", "����"));
		out.println("----------|----------");
		for (int i = 0; i < list.size(); i++) {
			out.println(String.format("%-10s| %s", list.get(i).getValue(), list.get(i).getKey()));
		}
		out.println("----------|----------");
	}

}