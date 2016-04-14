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
	// Напишете програма, която прочита списък от думи от файл, наречен
	// words.txt, преброява
	// колко пъти всяка от
	// тези думи се среща в друг файл text.txt и записва резултата в трети файл
	// – result.txt,
	// като преди това ги сортира по брой на срещане в намаляващ ред
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

			// Четене и записване в TreeSet на думите от words
			while ((line = input.readLine()) != null) {
				// Разделяне на думите
				String[] wordsTmp = line.split("[^a-zA-Zа-яА-Я]+");
				// Записване
				for (String word : wordsTmp) {
					words.add(word);
				}
			}
			// Четене на text.txt
			while ((line = comparation.readLine()) != null) {
				String[] wordsTmp = line.split("[^a-zA-Zа-яА-Я]+");
				// Обхождане на думите в текущия ред в text.txt
				for (String wordTmp : wordsTmp) {
					// Обхождане на думите в TreeSet (words.txt)
					for (String word : words) {
						// При съответствие на дума от words.txt
						// с дума от text.txt, добавяне на думата в
						// TreeMap или увеличаване на стойността й,
						// ако вече съществува
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
			// Прехвърляне на думите с техните стойности в ArrayList от Entry,
			// тъй като Collections.sort() с Comparator като параметър
			// работи с List, но не и с Map
			ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>();
			for (Entry<String, Integer> entry : wordsCounted.entrySet()) {
				list.add(entry);
			}

			Collections.sort(list, Comparators.DESCENDING_COUNT);
			output.println("Думите, срещнати във файла, подредени в низходящ ред.");
			writeIntoFile(output, list);

			Collections.sort(list, Comparators.ASCENDING_COUNT);
			output.println();
			output.println("Думите, срещнати във файла, подредени във възходящ ред.");
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
		out.println(String.format("%-10s| %s", "Честота", "Дума"));
		out.println("----------|----------");
		for (int i = 0; i < list.size(); i++) {
			out.println(String.format("%-10s| %s", list.get(i).getValue(), list.get(i).getKey()));
		}
		out.println("----------|----------");
	}

}