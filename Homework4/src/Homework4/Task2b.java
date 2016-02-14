package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дължина за първия масив: ");
		int size1 = sc.nextInt();
		String[] arr1 = new String[size1];
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("Въведете низ за елемент[%d]:  ", i);
			arr1[i] = sc.next();
		}
		System.out.print("Въведете дължина за втория масив: ");
		int size2 = sc.nextInt();
		String[] arr2 = new String[size2];
		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("Въведете низ за елемент[%d]:  ", i);
			arr2[i] = sc.next();
		}
		boolean isEqual = false;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i].equals(arr2[i])) {
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
