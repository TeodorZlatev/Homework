package Homework4;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		// �������� ��������, ����� ��������� ������� �� ������ ��������� �����
		// � ������� ���. ��������256, ������ �� ���� ���������� ����652.
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����: ");
		String number = sc.next();
		System.out.printf("������� %s � ������� ��� � ", number);
		for (int i = number.length()-1; i >= 0; i--) {
			System.out.print(number.charAt(i));
		}
	}
}
