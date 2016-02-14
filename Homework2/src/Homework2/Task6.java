package Homework2;

public class Task6 {

	public static void main(String[] args) {
		// 6)  Декларирайте две променливи от тип String със стойности "Hello" и
		// "World".
		// Декларирайте променлива от тип Object. Присвоете на тази променлива
		// стойността,
		// която се получава от конкатенацията на двете стрингови променливи
		// (добавете интервал,
		// ако е необходимо). Отпе­чатайте променливата от тип Object.
		// Декларирайте променлива от тип String и присвоете на последната
		// променливата от тип Object.

		String str1 = "Hello";
		String str2 = "World";
		Object obj = str1 + " " + str2;
		System.out.println(obj);
		String str3 = new String();
		obj = str3;

	}

}
