package Homework2;

public class Task8 {

	public static void main(String[] args) {
		// 8) ������������ ��� ���������� �� ��� float � ��� double.
		// ������������ �� ������ ��������� �� ����������� ���� ��� ����������
		// �����������
		// ����������� �� ���������, ��������� � ����������� (==, !=, <=, <, >,
		// =>). ���� ��������� �������� �� ������������ �:
		//
		// double doubleDigit = 3.5; float floatDigit = 3.5f;
		// ���� ���� ������� ����������� �� ������������: doubleDigit = 3.2;
		// floatDigit = 3.2f;
		//
		// ������ ������������ �� ������ ��������� �� ����������� ���� ���
		// ���������� ����������� ����������� �� ���������, ��������� �
		// �����������.
		//
		// �������� �� �� �������� ����������� �������� � ���� ���� � ��������
		// ������� ��������� ������ ���.

		double doubleDigit = 3.5;
		float floatDigit = 3.5f;
		System.out.println("Double digit is equal to float digit: " + (doubleDigit == floatDigit));
		doubleDigit = 3.2;
		floatDigit = 3.2f;
		System.out.println("Double digit is equal to float digit: " + (doubleDigit == floatDigit));
	}

}
