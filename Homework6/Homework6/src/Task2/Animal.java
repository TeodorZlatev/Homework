package Task2;

public abstract class Animal {
	private String name;
	private boolean isHungry = false;
	private boolean hasFood = false;

	public Animal(String name, boolean isHungry, boolean hasFood) {
		this.name = name;
		this.isHungry = isHungry;
		this.hasFood = hasFood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHungry() {
		return isHungry;
	}

	public boolean isHasFood() {
		return hasFood;
	}

	public void setHasFood(boolean hasFood) {
		this.hasFood = hasFood;
	}
	
	public abstract void showInfo();
	public abstract void eating();
}