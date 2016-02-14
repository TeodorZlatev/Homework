package Homework3;

public class Task1 {

	public static void main(String[] args) {
		// 1) Имате един работник, който с помоща на товарна количка изхвърля
		// боклук с големина 450 кг. Имате общ размер на боклука 7890 тона.
		// Напишете програма, която
		// изписва на екрана колко боклук е останал неизхвърлен, и колко боклук
		// е
		// успял да прехвърли до този момент работника. Работника трябва да
		// изхвърли
		// целия боклук. Използвайте цикъл.
		double wheelBarrow = 0.45;
		double garbage = 7890;
		double ejectedGarbage = 0;
		int times = 0;
		while (garbage > 0) {
			garbage -= wheelBarrow;
			ejectedGarbage += wheelBarrow;
			System.out.printf("%d. Изхвърленият до момента боклук е %.2f тона, остават %.2f тона.\n", times++,
					ejectedGarbage, garbage);
			if (garbage <= wheelBarrow) {
				wheelBarrow = garbage;
			}
		}
	}

}
