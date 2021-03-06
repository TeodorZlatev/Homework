package Task2;

import java.util.Arrays;

public class Room {
	private String name;
	private Person[] persons;
	private Animal[] animals;

	public Room(String name, Person[] persons, Animal[] animals) {
		this.name = name;
		this.persons = persons;
		this.animals = animals;
	}

	public String getName() {
		return name;
	}

	public Person[] getPersons() {
		return persons;
	}

	public Animal[] getAnimals() {
		return animals;
	}

	public void showInfo(){
		System.out.printf("� %s �� \n", name);
		for (int i=0; i<persons.length; i++){
			persons[i].showInfo();
		}
		for (int i=0; i<animals.length; i++){
			animals[i].showInfo();
		}
	}
}
