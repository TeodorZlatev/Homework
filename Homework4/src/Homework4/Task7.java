package Homework4;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� ������ ��������, ����� ������� ����� � ������ ����� ��
		// ���������� ������. �� �� ���� ���������� �� ���������� �� �������
		// ���� ��
		// ��������� � � �������� �� �� �������� ��������� �� ������� �� ������.
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ����: ");
		String word = sc.next();
		char[] arr = new char[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) ('a' + i);
		}
		System.out.printf("��������� �� ������� �� ������ \"%s\" �� ", word);
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (word.charAt(i) == arr[j]) {
					System.out.print(j);
					break;
				}
			}
			if (i < word.length() - 1) {
				System.out.print(", ");
			} else {
				System.out.println(".");
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d->%c ", i, arr[i]);
		}

	}

}
