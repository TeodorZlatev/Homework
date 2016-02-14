package Task2;

public class Fish extends Animal {

	public Fish(String name, boolean isHungry, boolean hasFood) {
		super(name, isHungry, hasFood);
	}

	public void eating() {
		if (this.isHasFood()) {
			System.out.printf("Риба %s изяде храната си.\n", this.getName());
			this.setHasFood(false);
		} else {
			System.out.printf("Риба %s няма оставена храна.\n", this.getName());
		}
	}

	public void showInfo() {
		System.out.printf("Риба\nИме: %s\n", this.getName());
	}

}
