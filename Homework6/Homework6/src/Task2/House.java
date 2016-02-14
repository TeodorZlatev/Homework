package Task2;

public class House {
	// ������ �� � ����. ����� ���� ��� ����. ��� ����� ���� ���� �� �����
	// �������� ���� ���� ��� �������. ������ ����� �� ������ ���������, �
	// ��������� ����� �� �� ������ �� ����, ����� �� � �������� �� ������ (���
	// �� � ��������, �� ����� ������ � �����, ��� ����� ������ �����������
	// ������ �� ����� �������, �� ������ ����� ���� ������������ �� ����
	// �������� ����� �� ������, � �������� ������ �� �� ������ � ���������, ��
	// ����������� ��������� ���� �����). ������ ���� �� ���������� ��������
	// ����: �����, ����, ����, � �.�. ����� ����� ���� ��� ���, ��� � �������.
	// ��������� ����� �� ����� ����, �����, ����� � ������� ��� ����������.
	//
	// �������� � �� �� �������� ���� ���� � JAVA �������. ������ �� �����������
	// ������� ������ � ������� ������, ��������, ������ � ������������.
	// ����������� � ����-��������, ����� �����������, �� ���������� �������
	// ������� ��������: ��������� �� �������� � ���� ����, � �� ��������� �
	// ���� ����.
	//
	// ����������� ���������� �/��� ����������, ������ �������, �� � �����.
	public static void main(String[] args) {

		Person person1 = new Person("����", '�', 37, "����");
		Person person2 = new Person("�����", '�', 35, "�����");
		Person person3 = new Person("������", '�', 8, "����");
		Person person4 = new Person("����������", '�', 12, "����");
		Cat cat1 = new Cat("����", true, true);
		Dog dog1 = new Dog("�����", true, false);
		Rabbit rabbit1 = new Rabbit("����", true, false);
		Fish fish1 = new Fish("�����", true, true);
		Room room1 = new Room("������ ���� �1", new Person[] { person3 }, new Animal[] { rabbit1 });
		Room room2 = new Room("������ ���� �2", new Person[] { person4 }, new Animal[] { fish1 });
		Room room3 = new Room("�����������", new Person[] { person1, person2 }, new Animal[] { cat1, dog1 });
		room1.showInfo();
		rabbit1.eating();
		person3.leaveFood(rabbit1);
		rabbit1.eating();
		room2.showInfo();
		fish1.eating();
		fish1.eating();
		person4.leaveFood(fish1);
		fish1.eating();
		room3.showInfo();
		dog1.eating();
		cat1.eating();
		person1.leaveFood(dog1);
		dog1.eating();
		
	}
}
