package Homework3;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		// 6) Напишете програма, която за дадена цифра (0-9),
		// зададена като вход, извежда името на цифрата на български език.
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете число в интервала [0,9]: ");
		int choice = sc.nextInt();
		while (choice < 0 || choice > 9){
			System.out.print("Въведете число в интервала [0,9]: ");
			choice = sc.nextInt();
		}
		switch (choice){
		case 0: System.out.println("Числото е нула."); break;
		case 1: System.out.println("Числото е едно."); break;
		case 2: System.out.println("Числото е две."); break;
		case 3: System.out.println("Числото е три."); break;
		case 4: System.out.println("Числото е четири."); break;
		case 5: System.out.println("Числото е пет."); break;
		case 6: System.out.println("Числото е шест."); break;
		case 7: System.out.println("Числото е седем."); break;
		case 8: System.out.println("Числото е осем."); break;
		case 9: System.out.println("Числото е девет."); break;
		}
	}
}
