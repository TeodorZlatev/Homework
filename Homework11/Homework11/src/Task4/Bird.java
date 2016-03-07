package Task4;

public class Bird extends Animal{
	public Bird(String name) {
		super(name);
	}
	
	@Override
	public void move() {
		System.out.println("летене.");
	}
}
