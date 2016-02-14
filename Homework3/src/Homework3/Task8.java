package Homework3;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		// 8) ДОПЪЛНИТЕЛНА : Напишете програма, която преобразува дадено число в
		// интервала [0..999] в текст,
		// съответстващ на българското произношение. Примери:
		// - 0 -> "Нула"
		// 22 -> „Двадесет и две“
		// 99 -> „Деведесет и девет“
		// 133 -> „Сто тридесет и три“
		// 401 -> „Четиристотин и едно“
		// Жокер: Използвайте вложени switch конструкции. Да се обърне внимание
		// на числата от
		// 0 до 19 и на онези, чиито единици е нула.
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете число в интервала [0,999]: ");
		int number = sc.nextInt();
		while (number < 0 || number > 999) {
			System.out.print("Въведете число в интервала [0,999]: ");
			number = sc.nextInt();
		}
		int hundreds = number / 100;
		int decimals = (number / 10) % 10;
		int units = number % 10;
		switch (hundreds) {
		case 0:
			break;
		case 1:
			System.out.print("сто ");
			break;
		case 2:
			System.out.print("двеста ");
			break;
		case 3:
			System.out.print("триста ");
			break;
		case 4:
			System.out.print("четиристотин ");
			break;
		case 5:
			System.out.print("петстотин ");
			break;
		case 6:
			System.out.print("шестстотин ");
			break;
		case 7:
			System.out.print("седемстотин ");
			break;
		case 8:
			System.out.print("осемстотин ");
			break;
		case 9:
			System.out.print("деветстотин ");
			break;
		}
		boolean decimalOne = false; // флаг, заради десетиците, дали са равни
									// на 1
		if ((hundreds != 0 && decimals == 0 && units != 0) || (hundreds != 0 && decimals != 0 && units == 0)) {
			System.out.print("и ");
		}
		switch (decimals) {
		case 1:
			decimalOne = true;
			if (units != 0) {
				System.out.print("и ");
			}
			switch (units) {
			case 0:
				System.out.print("десет ");
				break;
			case 1:
				System.out.print("единадесет ");
				break;
			case 2:
				System.out.print("дванадесет ");
				break;
			case 3:
				System.out.print("тринадесет ");
				break;
			case 4:
				System.out.print("четиринадесет ");
				break;
			case 5:
				System.out.print("петнадесет ");
				break;
			case 6:
				System.out.print("шестнадесет ");
				break;
			case 7:
				System.out.print("седемнадесет ");
				break;
			case 8:
				System.out.print("осемнадесет ");
				break;
			case 9:
				System.out.print("деветнадесет ");
				break;
			}
			break;
		case 2:
			System.out.print("двадесет");
			break;
		case 3:
			System.out.print("тридесет");
			break;
		case 4:
			System.out.print("четиридесет");
			break;
		case 5:
			System.out.print("петдесет");
			break;
		case 6:
			System.out.print("шестдесет");
			break;
		case 7:
			System.out.print("седемдесет");
			break;
		case 8:
			System.out.print("осемдесет");
			break;
		case 9:
			System.out.print("деветдесет");
			break;
		}
		if (!decimalOne) {
			if (decimals != 0 && units != 0) {
				System.out.print(" и ");
			}
			switch (units) {
			case 0:
				if (hundreds == 0 && decimals == 0) {
					System.out.println("нула");
				}
				break;
			case 1:
				System.out.println("едно");
				break;
			case 2:
				System.out.println("две");
				break;
			case 3:
				System.out.println("три");
				break;
			case 4:
				System.out.println("четири");
				break;
			case 5:
				System.out.println("пет");
				break;
			case 6:
				System.out.println("шест");
				break;
			case 7:
				System.out.println("седем");
				break;
			case 8:
				System.out.println("осем");
				break;
			case 9:
				System.out.println("девет");
				break;
			}
		}

	}
}
