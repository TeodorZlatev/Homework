package Homework4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ��������, ����� ������ ������ ������������� �� �����
		// ��������� ����� � N ��������, � ������ ���������� �� ������������
		// �������.
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ������� �� ������: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		double sumOfElements = 0;
		int maxElement = Integer.MIN_VALUE, indexOfMaxElement = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("�������� �������� �� �������[%d]: ", i);
			arr[i] = sc.nextInt();
			sumOfElements += arr[i];
			if (maxElement < arr[i]) {
				maxElement = arr[i];
				indexOfMaxElement = i;
			}
		}
		System.out.printf(
				"������������������� �� ������ � %.2f, � ���-�������� ������� � � ������[%d] � � ����� �� %d.\n",
				sumOfElements / size, indexOfMaxElement, maxElement);
	}

}
