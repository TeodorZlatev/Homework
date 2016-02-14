package Task2;

public class Rabbit extends Animal {

	public Rabbit(String name, boolean isHungry, boolean hasFood) {
		super(name, isHungry, hasFood);
	}

	public void eating() {
		if (this.isHasFood()) {
			System.out.printf("Заек %s изяде храната си.\n", this.getName());
			this.setHasFood(false);
		} else {
			System.out.printf("Заек %s няма оставена храна.\n", this.getName());
		}
	}
	
	public void showInfo() {
		System.out.printf("Заек\nИме: %s\n", this.getName());
	}

}
