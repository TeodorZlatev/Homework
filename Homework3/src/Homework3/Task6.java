package Homework3;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		// 6) �������� ��������, ����� �� ������ ����� (0-9),
		// �������� ���� ����, ������� ����� �� ������� �� ��������� ����.
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ����� � ��������� [0,9]: ");
		int choice = sc.nextInt();
		while (choice < 0 || choice > 9){
			System.out.print("�������� ����� � ��������� [0,9]: ");
			choice = sc.nextInt();
		}
		switch (choice){
		case 0: System.out.println("������� � ����."); break;
		case 1: System.out.println("������� � ����."); break;
		case 2: System.out.println("������� � ���."); break;
		case 3: System.out.println("������� � ���."); break;
		case 4: System.out.println("������� � ������."); break;
		case 5: System.out.println("������� � ���."); break;
		case 6: System.out.println("������� � ����."); break;
		case 7: System.out.println("������� � �����."); break;
		case 8: System.out.println("������� � ����."); break;
		case 9: System.out.println("������� � �����."); break;
		}
	}
}
