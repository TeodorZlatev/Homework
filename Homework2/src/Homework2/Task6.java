package Homework2;

public class Task6 {

	public static void main(String[] args) {
		// 6) ������������� ��� ���������� �� ��� String ��� ��������� "Hello" �
		// "World".
		// ������������ ���������� �� ��� Object. ��������� �� ���� ����������
		// ����������,
		// ����� �� �������� �� �������������� �� ����� ��������� ����������
		// (�������� ��������,
		// ��� � ����������). ����������� ������������ �� ��� Object.
		// ������������ ���������� �� ��� String � ��������� �� ����������
		// ������������ �� ��� Object.

		String str1 = "Hello";
		String str2 = "World";
		Object obj = str1 + " " + str2;
		System.out.println(obj);
		String str3 = new String();
		obj = str3;

	}

}
