package Task2;

public class Dog extends Animal {

	public Dog(String name, boolean isHungry, boolean hasFood) {
		super(name, isHungry, hasFood);
	}

	public void eating() {
		if (this.isHasFood()) {
			System.out.printf("Куче %s изяде храната си.\n", this.getName());
			this.setHasFood(false);
		} else {
			System.out.printf("Куче %s няма оставена храна.\n", this.getName());
		}
	}

	public void showInfo() {
		System.out.printf("Куче\nИме: %s\n", this.getName());
	}

}
