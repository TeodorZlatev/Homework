package Homework3;

public class Task2 {
	public static void main(String[] args) {
//		2) �������� ������ �� ������� ����� � ��������� �� 1 �� 100 �����������
		int sum = 0;
		for (int i=0; i<=100; i += 2){
			sum += i;
		}
		System.out.printf("������ �� ������ ����� ����� � ��������� [1,100] e %d.", sum);
	}

}
