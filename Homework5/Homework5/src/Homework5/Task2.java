package Homework5;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		// ������ 2:
		// �������� �����, ����� ��������� ������� �� ������ ��������� ����� �
		// ������� ���. �������� 512, ������ �� ���� ���������� ���� 215
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����: ");
		String number = sc.next();
		printBackToFront(number);

	}

	public static void printBackToFront(String number) {
		System.out.printf("������� %s ���������� ��������� � ", number);
		for (int i = number.length() - 1; i >= 0; i--) {
			System.out.print(number.charAt(i));
		}
	}
}
