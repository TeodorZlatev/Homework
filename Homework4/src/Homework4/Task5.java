package Homework4;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Напишете програма, която намира средно аритметичното на даден
		// двумерен масив (NxM) и намира стойността на максималният елемент.
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дължина на масива: ");
		int n = sc.nextInt();
		System.out.print("Въведете ширина на масива: ");
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		double sumOfElements = 0;
		int maxElement = Integer.MIN_VALUE, indexRowOfMaxElement = 0, indexColumnOfMaxElement = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("Въведете стойност за елемент[%d][%d]: ", i, j);
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
				"Средноаритметичното на масива е %.2f, а най-големият елемент е с индекс[%d][%d] и е равен на %d.\n",
				sumOfElements / (n * m), indexRowOfMaxElement, indexColumnOfMaxElement, maxElement);
	}

}
