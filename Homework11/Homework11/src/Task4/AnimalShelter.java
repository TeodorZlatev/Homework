package Task4;

import java.util.ArrayList;

//�������� ��������� ����: AnimalShelter. ���� ��� ������ ���� ����� �� �������. 
//������������ ��������� ������ �� ��������, ���������� �� ������ � ��������� 
//�� ������� � ���� �����. ���� � ���� ����� �� ���� �� �� ������� ���� ������� �� ����� ���, 
//��������: ���� Dog, Pitbull, etc.

//�������� �������� ���� �� �� ��������� ����������� �� ������. 
//����������� ������� ��������� �� ����� AnimalShelter �� �� �������� 
//�������� ������ ������� (�� �� ���� � ���� ���) � ���.

public class AnimalShelter<T extends Animal> {
	private String name;
	ArrayList<T> animals = new ArrayList<T>();

	AnimalShelter(String name) {
		this.name = name;
	}

	public void add(T animal) {
		animals.add(animal);
	}

	public void printAll() {
		if (animals.isEmpty()) {
			System.out.println("���� ������� � ����� \"" + this.name + "\".");
			return;
		}
		System.out.println("����� \"" + this.name + "\":");
		for (T animal : animals) {
			System.out.println(animal.getName());
		}
	}

	public void deleteAnimal(T removingAnimal) {
		if (animals.contains(removingAnimal)) {
			animals.remove(removingAnimal);
			System.out.println("��������� " + removingAnimal.getName() + " � ���������� �� �������.");
		} else {
			System.out.println("���� ������� � ��� " + removingAnimal.getName());
		}
	}

}
