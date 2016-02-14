package Task2;

public class House {
	// Дадена ни е къща. Всяка къща има стаи. Във всяка стая може да имате
	// различен брой хора или животни. Хората могат да хранят животните, а
	// животните могат да си хапват от това, което им е оставено от хората (ако
	// не е оставено, ще стоят гладни – тоест, ако някой извика поведението
	// хапвам на някое животно, то трябва преди това задължително да бъде
	// оставена храна от човека, в противен случай да се изпише в конзолата, че
	// конкретната животинка няма храна). Хората може да изпълняват различни
	// роли: майка, баща, дете, и т.н. Всеки човек нека има име, пол и възраст.
	// Животните могат да бъдат куче, котка, рибка и каквото вие дефинирате.
	//
	// Задачата е да се моделира тази къща с JAVA класове. Трябва да декларирате
	// класове заедно с техните полета, свойства, методи и конструктори.
	// Дефинирайте и клас-програма, който демонстрира, че останалите класове
	// работят коректно: съставете си сценарии в тази къща, и го разпишете в
	// този клас.
	//
	// Използвайте абстракция и/или интерфейси, където смятате, че е нужно.
	public static void main(String[] args) {

		Person person1 = new Person("Иван", 'м', 37, "баща");
		Person person2 = new Person("Ирина", 'ж', 35, "майка");
		Person person3 = new Person("Георги", 'м', 8, "дете");
		Person person4 = new Person("Александър", 'м', 12, "дете");
		Cat cat1 = new Cat("Сара", true, true);
		Dog dog1 = new Dog("Марли", true, false);
		Rabbit rabbit1 = new Rabbit("Бъгс", true, false);
		Fish fish1 = new Fish("Джони", true, true);
		Room room1 = new Room("Детска стая №1", new Person[] { person3 }, new Animal[] { rabbit1 });
		Room room2 = new Room("Детска стая №2", new Person[] { person4 }, new Animal[] { fish1 });
		Room room3 = new Room("Всекидневна", new Person[] { person1, person2 }, new Animal[] { cat1, dog1 });
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
