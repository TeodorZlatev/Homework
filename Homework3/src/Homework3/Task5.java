package Homework3;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		// 5) Намерете редицата на Фибоначи за N (0, 1, 1, 2,3,5,8……) .
		// Бележки : всеки следващ член се образува от сумата на предходните
		// два.
		// Първите два члена са 0 и 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("До кой член желаете редицата на Фибоначи? ");
		int choice = sc.nextInt();
		int precendingNumber = 0;
		int currentNumber = 1;
		System.out.printf("Първите %d члена на редицата на Фибоначи са: \n%d, %d, ", choice, precendingNumber,
				currentNumber);
		for (int i = 0; i < choice - 2; i++) {
			currentNumber += precendingNumber;
			precendingNumber = currentNumber - precendingNumber;
			System.out.print(currentNumber);
			if (i < (choice - 3)){
				System.out.print(", ");
			}
		}
	}
}
