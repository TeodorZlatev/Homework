package Homework3;

public class Task7 {
	public static void main(String[] args) {
		// 7) ДОПЪЛНИТЕЛНА : Напишете програма, с условието от точка 1), като в
		// допълнение знаете,
		// че докато работника изхвърля боклука, в същото време боклука нараства
		// с 150кг.
		// Тоест, при всяко изхвърляне на боклук от работника, общата стойност
		// на боклука нараства с 150кг.
		double wheelBarrow = 0.45; // количка
		double garbage = 7890; // боклук
		double ejectedGarbage = 0; // изхвърлен
		double extraGarbage = 0.15; // допълнение
		boolean isOver = false; // флаг, отчитащ дали е свършил боклука
		int times = 0;
		while (garbage > 0) {
			garbage -= wheelBarrow;
			garbage += extraGarbage;
			ejectedGarbage += wheelBarrow;
			System.out.printf("%d. Изхвърленият до момента боклук е %.2f тона, остават %.2f тона.\n", times++,
					ejectedGarbage, garbage);
			if (isOver) {
				break;
			}
			// проверката е боклук + допълнение, заради бъдещото прибавяне
			// след това количката присвоява стойността на останалия боклук и
			// бъдещото допълнение,
			// а изхвърления се коригира, заради бъдещото допълнение,
			// за да е актуална крайната информация за изхвърлен и оставащ
			// боклук.
			if (garbage + extraGarbage <= wheelBarrow) {
				wheelBarrow = garbage + extraGarbage;
				ejectedGarbage -= extraGarbage;
				isOver = true;
			}
		}
	}
}
