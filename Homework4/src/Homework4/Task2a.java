package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Напишете програма, която срявнява два масива за идентичност (например
		// масивът {1,2,3} ще е равен на масива {1,2,3}, но няма да е равен на
		// {1,2,2} или {1,2}).
		// Напишете два варианта, използвайки масиви от един примитивен тип и от
		// един референтен тип по ваш избор.
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дължина за първия масив: ");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("Въведете стойност за елемент[%d]:  ", i);
			arr1[i] = sc.nextInt();
		}
		System.out.print("Въведете дължина за втория масив: ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("Въведете стойност за елемент[%d]:  ", i);
			arr2[i] = sc.nextInt();
		}
		boolean isEqual = false;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[i]) {
					isEqual = true;
					break;
				}
			}
		}
		if (isEqual) {
			System.out.println("Двата масива са равни.");
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
		} else {
			System.out.println("Двата масива не са равни.");
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
		}
	}

}
