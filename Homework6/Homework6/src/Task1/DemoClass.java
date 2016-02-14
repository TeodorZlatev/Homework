package Task1;

import java.util.Random;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ 1:
		// ����������� �������� �� ����������� ������:
		//
		// - Circle
		// - Rectangle
		// - Square
		//
		// �� ������ �� ��� ������ �� ����� ���������� �� ���������� ����������
		// � ������ ��. ����������� ���������� ����� ���� ���� ����� �� ����
		// �������� �� �������.
		// �������� 10 ���������� ������ � �� �������� � �����. �� ����� ������
		// � ������ ����������� ������� ���������, ��������� � ����.
		//
		// ��������� � �������� ��� ������ ������� Math.random() � �����������
		// �� �� �� ���������� ������� ���������� �� ���� 10 ���������� ������.
		// ���� �� ���������� � ����� �������������� �� �������� ������
		// java.util.Random � ���� �� �� �������� ������ Math.random();
		//
		// �������� utility class (���� � private �����������) � �����, ����� ��
		// ����� ���������� ���������(�����) �� Circle, Rectangle ��� Square �
		// ����������� ������� ����������� �� �����.
		// ���� �������� �� ���������� ���������� �����, � �� �� ������ �
		// ������� �� 3. ����, � ���������� �� ��������, ���� �� ���������
		// ������� �� ����� ���� ��� ������ ����� �� ������� ����. �������� � ��
		// ���������� � ��������� �� ���������� ����� � ����� �������� (������
		// ���� Math.random/java.util.Random)
		Random rand = new Random();
		Figure[] figures = new Figure[10];
		for (int i = 0; i < figures.length; i++) {
			System.out.print("������ �" + i + " - ");
			figures[i] = UtilClass.generateFigure(rand.nextInt(3) + 1);
			figures[i].calculatePerimeter();
			figures[i].calculateArea();
			System.out.println();
		}
	}

}
