package Task4;

public class MainClass {

	public static void main(String[] args) {
		Dog dog1 = new Dog("���� 1");
		Dog dog2 = new Dog("���� 2");
		Dog dog3 = new Dog("���� 3");
		Dog dog4 = new Dog("���� 4");
		AnimalShelter<Dog> animalShelter1 = new AnimalShelter<Dog>("����� �� ������");
		animalShelter1.add(dog1);
		animalShelter1.add(dog2);
		animalShelter1.add(dog3);
		animalShelter1.printAll();
		animalShelter1.deleteAnimal(dog3);
		animalShelter1.printAll();
		
		Fish fish1 = new Fish("���� 1");
		Fish fish2 = new Fish("���� 2");
		Fish fish3 = new Fish("���� 3");
		AnimalShelter<Fish> animalShelter2 = new AnimalShelter<Fish>("����� �� ����");
		animalShelter2.add(fish1);
		animalShelter2.add(fish2);
		animalShelter2.add(fish3);
		animalShelter2.printAll();
		animalShelter2.deleteAnimal(fish2);
		animalShelter2.printAll();
		
		Bird bird1 = new Bird("����� 1");
		Bird bird2 = new Bird("����� 2");
		Bird bird3 = new Bird("����� 3");
		AnimalShelter<Bird> animalShelter3 = new AnimalShelter<Bird>("����� �� �����");
		animalShelter3.add(bird1);
		animalShelter3.add(bird2);
		animalShelter3.add(bird3);
		animalShelter3.printAll();
		animalShelter3.deleteAnimal(bird1);
		animalShelter3.printAll();

		AnimalShelter<Bird> animalShelter4 = new AnimalShelter<>("����� �� �����2");
		animalShelter4.deleteAnimal(bird2);
		animalShelter4.printAll();
		
	}

}
