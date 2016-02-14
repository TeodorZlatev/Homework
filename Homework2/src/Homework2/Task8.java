package Homework2;

public class Task8 {

	public static void main(String[] args) {
		// 8) Декларирайте две променливи от тип float и тип double.
		// Разпечатайте на екрана резултата от сравнението тези две променливи
		// използвайки
		// операторите за сравнение, равенство и неравенство (==, !=, <=, <, >,
		// =>). Нека началната стойност на променливите е:
		//
		// double doubleDigit = 3.5; float floatDigit = 3.5f;
		// След това сменете стойностите на променливите: doubleDigit = 3.2;
		// floatDigit = 3.2f;
		//
		// Отново разпечатайте на екрана резултата от сравнението тези две
		// променливи използвайки операторите за сравнение, равенство и
		// неравенство.
		//
		// Опитайте се да обясните използвайки коментар в кода защо е възможно
		// подобно поведение според вас.

		double doubleDigit = 3.5;
		float floatDigit = 3.5f;
		System.out.println("Double digit is equal to float digit: " + (doubleDigit == floatDigit));
		doubleDigit = 3.2;
		floatDigit = 3.2f;
		System.out.println("Double digit is equal to float digit: " + (doubleDigit == floatDigit));
	}

}
