package Homework4;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		// Напишете програма, която отпечатва цифрите на дадено десетично число
		// в обратен ред. Например 256, трябва да бъде отпечатано като 652.
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете число: ");
		String number = sc.next();
		System.out.printf("Числото %s в обратен ред е ", number);
		for (int i = number.length()-1; i >= 0; i--) {
			System.out.print(number.charAt(i));
		}
	}
}
