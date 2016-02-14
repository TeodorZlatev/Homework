package Homework5;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
		// Задача 4 (ДОПЪЛНИТЕЛНА):
		// Напишете метод, който да сортира едномерен числен масив с N елемента
		// във възходящ ред. Използвайте сортиращ алгоритъм по ваш избор
		// (например quick sort, bubble sort, direct sort).
		// Напишете вариантен метод, който приема и 2ри параметър показващ реда
		// на сортирането:
		// възходящо или низходящо.
		int[] arr = { -3, 12, 5, 21, 256, -52, 26 };
		System.out.println("Масивът " + Arrays.toString(arr));
		sort(arr, '>');
		System.out.println("сортиран в низходящ ред " + Arrays.toString(arr));
		sort(arr, '<');
		System.out.println("сортиран във възходящ ред " + Arrays.toString(arr));

	}

	public static void sort(int[] arr, char ch) {
		if (ch == '<') { // възходящ
			for (int i = 0; i < arr.length - 1; i++) {
				int index = i, temp = arr[i];
				boolean flag = false; // проверка, за да няма излишни
										// присвоявания
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[index] > arr[j]) {
						index = j;
						temp = arr[j];
						flag = true;
					}
				}

				if (flag) {
					arr[index] = arr[i];
					arr[i] = temp;
				}
			}
		} else {
			for (int i = 0; i < arr.length - 1; i++) {
				int index = i, temp = arr[i];
				boolean flag = false;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[index] < arr[j]) {
						index = j;
						temp = arr[j];
						flag = true;
					}
				}

				if (flag) {
					arr[index] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}
