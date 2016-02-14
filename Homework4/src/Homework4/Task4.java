package Homework4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Напишете програма, която намира средно аритметичното на даден
		// едномерен масив с N елемента, и намира стойността на максималният
		// елемент.
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дължина на масива: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		double sumOfElements = 0;
		int maxElement = Integer.MIN_VALUE, indexOfMaxElement = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Въведете стойност за елемент[%d]: ", i);
			arr[i] = sc.nextInt();
			sumOfElements += arr[i];
			if (maxElement < arr[i]) {
				maxElement = arr[i];
				indexOfMaxElement = i;
			}
		}
		System.out.printf(
				"Средноаритметичното на масива е %.2f, а най-големият елемент е с индекс[%d] и е равен на %d.\n",
				sumOfElements / size, indexOfMaxElement, maxElement);
	}

}
