package Task2;

public class Cat extends Animal {

	public Cat(String name, boolean isHungry, boolean hasFood) {
		super(name, isHungry, hasFood);
	}

	public void eating() {
		if (this.isHasFood()) {
			System.out.printf("����� %s ����� ������� ��.\n", this.getName());
			this.setHasFood(false);
		} else {
			System.out.printf("����� %s ���� �������� �����.\n", this.getName());
		}
	}

	public void showInfo() {
		System.out.printf("�����\n���: %s\n", this.getName());
	}

}
