package Homework3;

public class Task7 {
	public static void main(String[] args) {
		// 7) ������������ : �������� ��������, � ��������� �� ����� 1), ���� �
		// ���������� ������,
		// �� ������ ��������� �������� �������, � ������ ����� ������� ��������
		// � 150��.
		// �����, ��� ����� ���������� �� ������ �� ���������, ������ ��������
		// �� ������� �������� � 150��.
		double wheelBarrow = 0.45; // �������
		double garbage = 7890; // ������
		double ejectedGarbage = 0; // ���������
		double extraGarbage = 0.15; // ����������
		boolean isOver = false; // ����, ������� ���� � ������� �������
		int times = 0;
		while (garbage > 0) {
			garbage -= wheelBarrow;
			garbage += extraGarbage;
			ejectedGarbage += wheelBarrow;
			System.out.printf("%d. ������������ �� ������� ������ � %.2f ����, ������� %.2f ����.\n", times++,
					ejectedGarbage, garbage);
			if (isOver) {
				break;
			}
			// ���������� � ������ + ����������, ������ �������� ���������
			// ���� ���� ��������� ��������� ���������� �� ��������� ������ �
			// �������� ����������,
			// � ����������� �� ��������, ������ �������� ����������,
			// �� �� � �������� �������� ���������� �� ��������� � �������
			// ������.
			if (garbage + extraGarbage <= wheelBarrow) {
				wheelBarrow = garbage + extraGarbage;
				ejectedGarbage -= extraGarbage;
				isOver = true;
			}
		}
	}
}
