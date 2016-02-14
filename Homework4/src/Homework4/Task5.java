package Homework4;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ��������, ����� ������ ������ ������������� �� �����
		// �������� ����� (NxM) � ������ ���������� �� ������������ �������.
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ������� �� ������: ");
		int n = sc.nextInt();
		System.out.print("�������� ������ �� ������: ");
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		double sumOfElements = 0;
		int maxElement = Integer.MIN_VALUE, indexRowOfMaxElement = 0, indexColumnOfMaxElement = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("�������� �������� �� �������[%d][%d]: ", i, j);
				arr[i][j] = sc.nextInt();
				sumOfElements += arr[i][j];
				if (maxElement < arr[i][j]) {
					maxElement = arr[i][j];
					indexRowOfMaxElement = i;
					indexColumnOfMaxElement = j;
				}
			}
		}
		System.out.printf(
				"������������������� �� ������ � %.2f, � ���-�������� ������� � � ������[%d][%d] � � ����� �� %d.\n",
				sumOfElements / (n * m), indexRowOfMaxElement, indexColumnOfMaxElement, maxElement);
	}

}
