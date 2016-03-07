package Task4;

public class Fish extends Animal{
	public Fish(String name) {
		super(name);
	}

	@Override
	public void move() {
		System.out.println("плуване");
	}
}
