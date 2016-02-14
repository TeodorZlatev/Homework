package Task3;

import java.util.Scanner;

public class DemoClass {
	public static void main(String[] args) {
		// Задача 3:
		// Напишете програма, която създава x на брой обекта от тип Dog. x се
		// въвежда от клавиатурата. Дава им имена от вида MyDog-N, където N e
		// уникален пореден номер на обекта, и накрая извиква метода bark() на
		// всеки от тях.
		// Нека Dog има член променлива: name и метод, чиято импленентация да
		// принтира name + “ is barking very loud”.
		// Напишете метод, който връща броя на създадените обекти от класа Dog.
		// Напишете проверка дали броят създадени обекти е равен на x.
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете брой кучета: ");
		int x = sc.nextInt();
		Dog[] dogs = new Dog[x];
		for (int i=0; i<dogs.length; i++){
			dogs[i] = new Dog(i);
			dogs[i].bark();
		}
		System.out.println("Броят на създадените обекти е " + Dog.getNumberOfDogs());
		checkEquality(dogs, x);
		dogs[3] = null;
		checkEquality(dogs, x);
	}
	
	public static void checkEquality(Object[] arr, int count){
		boolean flag = true;
		for (int i=0; i<count; i++){
			if (arr[i] == null){
				flag = false;
				break;
			}
		}
		System.out.println("Броят на създадените обекти е равен на x: " + flag);
	}
}


