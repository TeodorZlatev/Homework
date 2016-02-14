package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		// Напишете програма, която въвежда NxN двумерен масив от конзолата
		// (първо пита за N, след това въвежа елементите един по един на
		// дадените индекси).
		// Намерете двата диагонала, като изпишете елементите им на екрана. След
		// това изпишете центъра (пресечната точка надвата диагонала) и изпишете
		// и него.
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дължина и ширина на масива: ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("Въведете стойност за елемент[%d][%d]:  ", i, j);
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.print("Главният диагонал на масива е: ");
		for (int i = 0, j = 0; i < arr.length; i++, j++) {
			System.out.print(arr[i][j]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println(";");
			}
		}
		System.out.print("Второстепенният диагонал на масива е: ");
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			System.out.print(arr[i][j]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println(";");
			}
		}

		if (n % 2 == 1) {
			System.out.printf("Центърът на масива е %d.\n", arr[(n - 1) / 2][(n - 1) / 2]);

		} else {
			System.out.print("Не може да се определи центърът на масива.");
		}

	}
}
