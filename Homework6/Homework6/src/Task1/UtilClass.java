package Task1;

import java.util.Random;

public final class UtilClass {
	private UtilClass() {
	};
	
	public static Figure generateFigure(int number){
		Figure figure;
		Random rand = new Random();
		if (number == 1){
			figure = new Circle(rand.nextInt(50)+1);
		} else if (number == 2){
			figure = new Rectangle(rand.nextInt(50)+1,rand.nextInt(50)+1);
		} else {
			figure = new Square(rand.nextInt(50)+1);
		}
		return figure;
	}
}
