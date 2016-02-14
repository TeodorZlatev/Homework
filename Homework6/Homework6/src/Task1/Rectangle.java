package Task1;

public class Rectangle extends Figure {
	private int firstSide;
	private int secondSide;
	public static int numberRectangles=0;

	public Rectangle(int firstSide, int secondSide) {
		System.out.println("������������ � " + numberRectangles++);
		this.firstSide = firstSide;
		this.secondSide = secondSide;
	}

	public int getFirstSide() {
		return firstSide;
	}

	public int getSecondSide() {
		return secondSide;
	}

	public void calculatePerimeter() {
		System.out.printf("����������� �� ������������� � 2.(%d + %d) = %d.\n", firstSide, secondSide,
				(2 * (firstSide + secondSide)));

	}

	public void calculateArea() {
		System.out.printf("������ �� ������������� � %d.%d = %d.\n", firstSide, secondSide, (firstSide * secondSide));

	}

}
