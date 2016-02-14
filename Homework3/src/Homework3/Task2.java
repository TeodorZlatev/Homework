package Homework3;

public class Task2 {
	public static void main(String[] args) {
//		2) Намерете сумата на ЧЕТНИТЕ числа в диапазона от 1 до 100 включително
		int sum = 0;
		for (int i=0; i<=100; i += 2){
			sum += i;
		}
		System.out.printf("Сумата на всички четни числа в интервала [1,100] e %d.", sum);
	}

}
