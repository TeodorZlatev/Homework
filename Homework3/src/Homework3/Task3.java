package Homework3;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		// 3) �������� ��������, ����� �� �������� ������� �� �������� ��
		// ��������.
		// ������������ ������� ����� � ��� �� �������� �� ����� �� ��������, ��
		// ������� ����� �� ������.
		// ������ : �������� ������� 3 ���� ��������� � �� �� ������ ������,
		// ��������� �� ������� - � ������ �March". "
		// + "��� ���� ����� �����, �� �������� ��������� "Please, enter correct
		// month number�
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����, ������������� �� �����: ");
		int month = sc.nextInt();
		while (month < 1 || month > 12) {
			System.out.println("����, �������� �������� �����!");
			month = sc.nextInt();
		}
		switch (month) {
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("��������");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("�����");
			break;
		case 5:
			System.out.println("���");
			break;
		case 6:
			System.out.println("���");
			break;
		case 7:
			System.out.println("���");
			break;
		case 8:
			System.out.println("������");
			break;
		case 9:
			System.out.println("���������");
			break;
		case 10:
			System.out.println("��������");
			break;
		case 11:
			System.out.println("�������");
			break;
		case 12:
			System.out.println("��������");
			break;
		}
	}
}
