package Task2;

public class Person {

	private String name;
	private char gender;
	private int age;
	private String responsibility;

	public Person(String name, char gender, int age, String responsibility) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.responsibility = responsibility;
	}

	public void showInfo() {
		System.out.printf("���: %s\n���: %c\n������: %d\n�����������: %s\n", name, gender, age, responsibility);
	}

	public void leaveFood(Animal animal) {
		System.out.printf("%s ������ ����� �� %s.\n", name, animal.getName());
		animal.setHasFood(true);
	}
}