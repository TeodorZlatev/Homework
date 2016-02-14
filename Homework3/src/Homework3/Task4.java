package Homework3;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		// 4) Напишете програма, която да намира най-голямото от дадени 3 числа.
		// Числата се въвеждат през конзолата. (използвайте if-else оператора).
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете първо число: ");
		int firstNumber = sc.nextInt();
		System.out.print("Въведете второ число: ");
		int secondNumber = sc.nextInt();
		System.out.print("Въведете трето число: ");
		int thirdNumber = sc.nextInt();
		if (firstNumber > secondNumber) {
			if (firstNumber > thirdNumber) {
				System.out.println("Първото число е най-голямо и равно на " + firstNumber + ".");
			} else {
				if (firstNumber == thirdNumber) {
					System.out.println("Първото и третото числа са най-големи и са равни на " + thirdNumber + ".");
				} else {
					System.out.println("Третото число е най-голямо и е равно на " + thirdNumber + ".");
				}
			}
		} else if (firstNumber == secondNumber) {
			if (firstNumber == thirdNumber) {
				System.out.println("Трите числа са равни на " + firstNumber + ".");
			} else {
				if (firstNumber > thirdNumber) {
					System.out.println("Първото и второто числа са най-големи и са равни на " + firstNumber + ".");
				} else {
					System.out.println("Третото число е най-голямо и е равно на " + thirdNumber + ".");
				}
			}
		} else {
			if (secondNumber > thirdNumber) {
				System.out.println("Второто число е най-голямо и равно на " + secondNumber + ".");
			} else {
				if (secondNumber == thirdNumber) {
					System.out.println("Второто и третото числа са най-големи и са равни на " + secondNumber + ".");
				} else {
					System.out.println("Третото число е най-голямо и е равно на " + thirdNumber + ".");
				}
			}
		}
	}
}
