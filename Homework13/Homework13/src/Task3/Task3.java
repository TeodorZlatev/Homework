package Task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
	public static void main(String[] args) {
		BufferedReader input = null;
		try {
			input = new BufferedReader(new FileReader("task3.txt"));
			String word = "�����";
			String line;
			int startIndex = 0;
			String sentence = new String();
			// ���� ���
			while ((line = input.readLine()) != null) {
				// ������� ����
				for (int i = startIndex; i < line.length(); i++) {
					if (line.charAt(i) == '.' || line.charAt(i) == '!' || line.charAt(i) == '?') {
						// ��� ������ ����� �� ��������������� ������� sentence
						// = �����������
						sentence = sentence + " " + line.substring(startIndex, i);
						if (sentence.contains(word)) {
							// �������� �� 75 �������. ��� ����������� � �����
							// ������ ����� ������
							for (int j = 0; j < sentence.length(); j++) {
								System.out.print(sentence.charAt(j));
								if (j % 70 == 0) {
									System.out.println();
								}
							}
							// ����� ������������� ����
							System.out.println(line.charAt(i));
						}
						if ((i + 1) != line.length() - 1) {
							// ��� � ����� ���� �� ���� ������� �������� ��
							// ������ ���������
							startIndex = i + 1;
						}
						sentence = "";
					}
					if (i == line.length() - 1) {
						// ��� ����������� �� � ��������� ����� ����
						// �� ������� �
						sentence = sentence + " " + line.substring(startIndex, i + 1);
						startIndex = 0;
					}
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �� ���� �� �� ������..");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}

	}
}
