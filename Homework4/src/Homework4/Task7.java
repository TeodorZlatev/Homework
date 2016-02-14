package Homework4;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Да се напише програма, която създава масив с всички букви от
		// латинската азбука. Да се даде възможност на потребител да въвежда
		// дума от
		// конзолата и в резултат да се извеждат индексите на буквите от думата.
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дума: ");
		String word = sc.next();
		char[] arr = new char[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) ('a' + i);
		}
		System.out.printf("Индексите на буквите от думата \"%s\" са ", word);
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (word.charAt(i) == arr[j]) {
					System.out.print(j);
					break;
				}
			}
			if (i < word.length() - 1) {
				System.out.print(", ");
			} else {
				System.out.println(".");
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d->%c ", i, arr[i]);
		}

	}

}
