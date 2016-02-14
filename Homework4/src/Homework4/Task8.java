package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ДОПЪЛНИТЕЛНА: Напишете същата програма като 2, но масивът да е NxM
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дължина на масива: ");
		int n1 = sc.nextInt();
		System.out.print("Въведете ширина на масива: ");
		int m1 = sc.nextInt();
		int[][] arr1 = new int[n1][m1];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.printf("Въведете стойност за елемент[%d][%d]: ", i, j);
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.print("Въведете дължина на масива: ");
		int n2 = sc.nextInt();
		System.out.print("Въведете ширина на масива: ");
		int m2 = sc.nextInt();
		int[][] arr2 = new int[n2][m2];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("Въведете стойност за елемент[%d][%d]: ", i, j);
				arr2[i][j] = sc.nextInt();
			}
		}
		boolean isEqual = false;
		if ((arr1.length == arr2.length) && (arr1[0].length == arr2[0].length)) {
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1[i].length; j++)
					if (arr1[i][j] == arr2[i][j]) {
						isEqual = true;
						break;
					}
			}
		}
		if (isEqual) {
			System.out.println("Двата масива са равни.");
			System.out.println("Масив №1:");
			for (int i = 0; i < arr1.length; i++) {
				System.out.println(Arrays.toString(arr1[i]));
			}
			System.out.println("Масив №2:");
			for (int i = 0; i < arr2.length; i++) {
				System.out.println(Arrays.toString(arr2[i]));
			}
		} else {
			System.out.println("Двата масива не са равни.");
			System.out.println("Масив №1:");
			for (int i = 0; i < arr1.length; i++) {
				System.out.println(Arrays.toString(arr1[i]));
			}
			System.out.println("Масив №2:");

			for (int i = 0; i < arr2.length; i++) {
				System.out.println(Arrays.toString(arr2[i]));
			}
		}
	}

}
