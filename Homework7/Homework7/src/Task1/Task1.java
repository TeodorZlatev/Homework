package Task1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		boolean isIncorrect = true;
		while (isIncorrect) {
			try {
				Scanner sc = new Scanner(System.in);
				isIncorrect = false;
				System.out.print("Въведете реално число: ");
				float number = sc.nextFloat();
				System.out.println("Въведеното реално число е " + number + ".");
			} catch (InputMismatchException ime) {
				isIncorrect = true;
				System.out.println("The token doesn't match the Float regular expression.");
			} catch (NoSuchElementException nsee) {
				isIncorrect = true;
				System.out.println("Input is exhausted.");
			} catch (IllegalStateException ise) {
				isIncorrect = true;
				System.out.println("This scanner is closed.");
			}
		}
	}
}
