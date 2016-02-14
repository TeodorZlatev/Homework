package Homework2;

public class Task7 {

	public static void main(String[] args) {

		// 7) Декларирайте две променливи от тип int. Задайте им стойности
		// съответно 5 и 10.
		// Разменете стойностите им и ги отпечатайте.
		int x = 5;
		int y = 10;
		System.out.println("x = " + x + ", y = " + y);
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("x = " + x + ", y = " + y);

	}

}
