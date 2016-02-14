package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		// �������� ��������, ����� ������� NxN �������� ����� �� ���������
		// (����� ���� �� N, ���� ���� ������ ���������� ���� �� ���� ��
		// �������� �������).
		// �������� ����� ���������, ���� �������� ���������� �� �� ������. ����
		// ���� �������� ������� (���������� ����� ������� ���������) � ��������
		// � ����.
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ������� � ������ �� ������: ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("�������� �������� �� �������[%d][%d]:  ", i, j);
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.print("�������� �������� �� ������ �: ");
		for (int i = 0, j = 0; i < arr.length; i++, j++) {
			System.out.print(arr[i][j]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println(";");
			}
		}
		System.out.print("��������������� �������� �� ������ �: ");
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			System.out.print(arr[i][j]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println(";");
			}
		}

		if (n % 2 == 1) {
			System.out.printf("�������� �� ������ � %d.\n", arr[(n - 1) / 2][(n - 1) / 2]);

		} else {
			System.out.print("�� ���� �� �� �������� �������� �� ������.");
		}

	}
}
