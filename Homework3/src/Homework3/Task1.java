package Homework3;

public class Task1 {

	public static void main(String[] args) {
		// 1) ����� ���� ��������, ����� � ������ �� ������� ������� ��������
		// ������ � �������� 450 ��. ����� ��� ������ �� ������� 7890 ����.
		// �������� ��������, �����
		// ������� �� ������ ����� ������ � ������� �����������, � ����� ������
		// �
		// ����� �� ��������� �� ���� ������ ���������. ��������� ������ ��
		// ��������
		// ����� ������. ����������� �����.
		double wheelBarrow = 0.45;
		double garbage = 7890;
		double ejectedGarbage = 0;
		int times = 0;
		while (garbage > 0) {
			garbage -= wheelBarrow;
			ejectedGarbage += wheelBarrow;
			System.out.printf("%d. ������������ �� ������� ������ � %.2f ����, ������� %.2f ����.\n", times++,
					ejectedGarbage, garbage);
			if (garbage <= wheelBarrow) {
				wheelBarrow = garbage;
			}
		}
	}

}
