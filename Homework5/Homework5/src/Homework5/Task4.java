package Homework5;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
		// ������ 4 (������������):
		// �������� �����, ����� �� ������� ��������� ������ ����� � N ��������
		// ��� �������� ���. ����������� �������� ��������� �� ��� �����
		// (�������� quick sort, bubble sort, direct sort).
		// �������� ��������� �����, ����� ������ � 2�� ��������� �������� ����
		// �� �����������:
		// ��������� ��� ���������.
		int[] arr = { -3, 12, 5, 21, 256, -52, 26 };
		System.out.println("������� " + Arrays.toString(arr));
		sort(arr, '>');
		System.out.println("�������� � �������� ��� " + Arrays.toString(arr));
		sort(arr, '<');
		System.out.println("�������� ��� �������� ��� " + Arrays.toString(arr));

	}

	public static void sort(int[] arr, char ch) {
		if (ch == '<') { // ��������
			for (int i = 0; i < arr.length - 1; i++) {
				int index = i, temp = arr[i];
				boolean flag = false; // ��������, �� �� ���� �������
										// ������������
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[index] > arr[j]) {
						index = j;
						temp = arr[j];
						flag = true;
					}
				}

				if (flag) {
					arr[index] = arr[i];
					arr[i] = temp;
				}
			}
		} else {
			for (int i = 0; i < arr.length - 1; i++) {
				int index = i, temp = arr[i];
				boolean flag = false;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[index] < arr[j]) {
						index = j;
						temp = arr[j];
						flag = true;
					}
				}

				if (flag) {
					arr[index] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}
