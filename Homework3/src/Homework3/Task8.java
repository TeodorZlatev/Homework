package Homework3;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		// 8) ������������ : �������� ��������, ����� ����������� ������ ����� �
		// ��������� [0..999] � �����,
		// ������������ �� ����������� ������������. �������:
		// - 0 -> "����"
		// 22 -> ��������� � ���
		// 99 -> ���������� � �����
		// 133 -> ���� �������� � ���
		// 401 -> ������������� � ����
		// �����: ����������� ������� switch �����������. �� �� ������ ��������
		// �� ������� ��
		// 0 �� 19 � �� �����, ����� ������� � ����.
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ����� � ��������� [0,999]: ");
		int number = sc.nextInt();
		while (number < 0 || number > 999) {
			System.out.print("�������� ����� � ��������� [0,999]: ");
			number = sc.nextInt();
		}
		int hundreds = number / 100;
		int decimals = (number / 10) % 10;
		int units = number % 10;
		switch (hundreds) {
		case 0:
			break;
		case 1:
			System.out.print("��� ");
			break;
		case 2:
			System.out.print("������ ");
			break;
		case 3:
			System.out.print("������ ");
			break;
		case 4:
			System.out.print("������������ ");
			break;
		case 5:
			System.out.print("��������� ");
			break;
		case 6:
			System.out.print("���������� ");
			break;
		case 7:
			System.out.print("����������� ");
			break;
		case 8:
			System.out.print("���������� ");
			break;
		case 9:
			System.out.print("����������� ");
			break;
		}
		boolean decimalOne = false; // ����, ������ ����������, ���� �� �����
									// �� 1
		if ((hundreds != 0 && decimals == 0 && units != 0) || (hundreds != 0 && decimals != 0 && units == 0)) {
			System.out.print("� ");
		}
		switch (decimals) {
		case 1:
			decimalOne = true;
			if (units != 0) {
				System.out.print("� ");
			}
			switch (units) {
			case 0:
				System.out.print("����� ");
				break;
			case 1:
				System.out.print("���������� ");
				break;
			case 2:
				System.out.print("���������� ");
				break;
			case 3:
				System.out.print("���������� ");
				break;
			case 4:
				System.out.print("������������� ");
				break;
			case 5:
				System.out.print("���������� ");
				break;
			case 6:
				System.out.print("����������� ");
				break;
			case 7:
				System.out.print("������������ ");
				break;
			case 8:
				System.out.print("����������� ");
				break;
			case 9:
				System.out.print("������������ ");
				break;
			}
			break;
		case 2:
			System.out.print("��������");
			break;
		case 3:
			System.out.print("��������");
			break;
		case 4:
			System.out.print("�����������");
			break;
		case 5:
			System.out.print("��������");
			break;
		case 6:
			System.out.print("���������");
			break;
		case 7:
			System.out.print("����������");
			break;
		case 8:
			System.out.print("���������");
			break;
		case 9:
			System.out.print("����������");
			break;
		}
		if (!decimalOne) {
			if (decimals != 0 && units != 0) {
				System.out.print(" � ");
			}
			switch (units) {
			case 0:
				if (hundreds == 0 && decimals == 0) {
					System.out.println("����");
				}
				break;
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("���");
				break;
			case 3:
				System.out.println("���");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("���");
				break;
			case 6:
				System.out.println("����");
				break;
			case 7:
				System.out.println("�����");
				break;
			case 8:
				System.out.println("����");
				break;
			case 9:
				System.out.println("�����");
				break;
			}
		}

	}
}
