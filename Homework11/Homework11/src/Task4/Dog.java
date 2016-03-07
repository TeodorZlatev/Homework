package Task4;

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}

	@Override
	public void move() {
		System.out.println("вървене");
	}

}
