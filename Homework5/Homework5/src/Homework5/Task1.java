package Homework5;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ 1:
		// �������� �����, ����� �� ������ 2 ���������� : ������� � ���������
		// ����� �� ���� �����, � ������� ��������� � ���� �����.
		// ���� �� ������� ���� ����������� ����� ������� � ����� �� ����������
		// �� ����������, ����� � �������� ��� ������ ���������; ��� ������
		// ������� �������, ���� �� ����� true ���� ��������, � �������� ������
		// �� �� ����� false. �������� ��������, ����� ������ ���� ����� �
		// �������� ������ �����.
		int[] arr = { 1, 2, 5, -6, -3, 21 };
		int number = 5;
		System.out.println(
				"������� " + Arrays.toString(arr) + " ������� ������� " + number + ": " + containsNumber(arr, number));

	}

	public static boolean containsNumber(int[] arr, int number) {
		boolean containsNumber = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				containsNumber = true;
				break;
			}
		}
		return containsNumber;
	}

}