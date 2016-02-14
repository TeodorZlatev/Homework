package Homework3;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		// 3) Напишете програма, която да принтира имената на месеците от
		// годината.
		// Потребителят въвежда число и ако то отговаря на месец от годината, се
		// показва името на месеца.
		// Пример : Въвеждам числото 3 през конзолата и тя ще изведе месеца,
		// отговарящ на числото - в случая “March". "
		// + "Ако няма такъв месец, се принтира съобщение "Please, enter correct
		// month number“
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете число, съответстващо на месец: ");
		int month = sc.nextInt();
		while (month < 1 || month > 12) {
			System.out.println("Моля, въведете коректно число!");
			month = sc.nextInt();
		}
		switch (month) {
		case 1:
			System.out.println("Януари");
			break;
		case 2:
			System.out.println("Февруари");
			break;
		case 3:
			System.out.println("Март");
			break;
		case 4:
			System.out.println("Април");
			break;
		case 5:
			System.out.println("Май");
			break;
		case 6:
			System.out.println("Юни");
			break;
		case 7:
			System.out.println("Юли");
			break;
		case 8:
			System.out.println("Август");
			break;
		case 9:
			System.out.println("Септември");
			break;
		case 10:
			System.out.println("Октомври");
			break;
		case 11:
			System.out.println("Ноември");
			break;
		case 12:
			System.out.println("Декември");
			break;
		}
	}
}
