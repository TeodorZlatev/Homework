package Task1;

public class Circle extends Figure {
	private int radius;
	public static int numberCircles = 0;

	public Circle(int radius) {
		System.out.println("кръг № " + numberCircles++);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void calculatePerimeter() {
		System.out.printf("Периметърът на кръга е 2.%d.%.2f = %.2f.\n", radius, Math.PI, (2 * radius * Math.PI));
	}

	public void calculateArea() {
		System.out.printf("Площта на кръга е %.2f.%2$d.%2$d = %3$.2f.\n", Math.PI, radius, (Math.PI * radius * radius));
	}

}
