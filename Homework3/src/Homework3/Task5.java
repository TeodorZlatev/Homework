package Homework3;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		// 5) �������� �������� �� �������� �� N (0, 1, 1, 2,3,5,8��) .
		// ������� : ����� ������� ���� �� �������� �� ������ �� �����������
		// ���.
		// ������� ��� ����� �� 0 � 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ��� ���� ������� �������� �� ��������? ");
		int choice = sc.nextInt();
		int precendingNumber = 0;
		int currentNumber = 1;
		System.out.printf("������� %d ����� �� �������� �� �������� ��: \n%d, %d, ", choice, precendingNumber,
				currentNumber);
		for (int i = 0; i < choice - 2; i++) {
			currentNumber += precendingNumber;
			precendingNumber = currentNumber - precendingNumber;
			System.out.print(currentNumber);
			if (i < (choice - 3)){
				System.out.print(", ");
			}
		}
	}
}
