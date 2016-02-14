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
		System.out.printf("Име: %s\nПол: %c\nГодини: %d\nОтговорност: %s\n", name, gender, age, responsibility);
	}

	public void leaveFood(Animal animal) {
		System.out.printf("%s остави храна за %s.\n", name, animal.getName());
		animal.setHasFood(true);
	}
}