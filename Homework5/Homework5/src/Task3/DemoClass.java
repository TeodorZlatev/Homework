package Task3;

import java.util.Scanner;

public class DemoClass {
	public static void main(String[] args) {
		// ������ 3:
		// �������� ��������, ����� ������� x �� ���� ������ �� ��� Dog. x ��
		// ������� �� ������������. ���� �� ����� �� ���� MyDog-N, ������ N e
		// �������� ������� ����� �� ������, � ������ ������� ������ bark() ��
		// ����� �� ���.
		// ���� Dog ��� ���� ����������: name � �����, ����� ������������� ��
		// �������� name + � is barking very loud�.
		// �������� �����, ����� ����� ���� �� ����������� ������ �� ����� Dog.
		// �������� �������� ���� ����� ��������� ������ � ����� �� x.
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ���� ������: ");
		int x = sc.nextInt();
		Dog[] dogs = new Dog[x];
		for (int i=0; i<dogs.length; i++){
			dogs[i] = new Dog(i);
			dogs[i].bark();
		}
		System.out.println("����� �� ����������� ������ � " + Dog.getNumberOfDogs());
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
		System.out.println("����� �� ����������� ������ � ����� �� x: " + flag);
	}
}


