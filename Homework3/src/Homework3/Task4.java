package Homework3;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		// 4) �������� ��������, ����� �� ������ ���-�������� �� ������ 3 �����.
		// ������� �� �������� ���� ���������. (����������� if-else ���������).
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ����� �����: ");
		int firstNumber = sc.nextInt();
		System.out.print("�������� ����� �����: ");
		int secondNumber = sc.nextInt();
		System.out.print("�������� ����� �����: ");
		int thirdNumber = sc.nextInt();
		if (firstNumber > secondNumber) {
			if (firstNumber > thirdNumber) {
				System.out.println("������� ����� � ���-������ � ����� �� " + firstNumber + ".");
			} else {
				if (firstNumber == thirdNumber) {
					System.out.println("������� � ������� ����� �� ���-������ � �� ����� �� " + thirdNumber + ".");
				} else {
					System.out.println("������� ����� � ���-������ � � ����� �� " + thirdNumber + ".");
				}
			}
		} else if (firstNumber == secondNumber) {
			if (firstNumber == thirdNumber) {
				System.out.println("����� ����� �� ����� �� " + firstNumber + ".");
			} else {
				if (firstNumber > thirdNumber) {
					System.out.println("������� � ������� ����� �� ���-������ � �� ����� �� " + firstNumber + ".");
				} else {
					System.out.println("������� ����� � ���-������ � � ����� �� " + thirdNumber + ".");
				}
			}
		} else {
			if (secondNumber > thirdNumber) {
				System.out.println("������� ����� � ���-������ � ����� �� " + secondNumber + ".");
			} else {
				if (secondNumber == thirdNumber) {
					System.out.println("������� � ������� ����� �� ���-������ � �� ����� �� " + secondNumber + ".");
				} else {
					System.out.println("������� ����� � ���-������ � � ����� �� " + thirdNumber + ".");
				}
			}
		}
	}
}
