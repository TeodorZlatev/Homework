package Task1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете число: ");
		int number = sc.nextInt();
		switch (number){
		case 1: Month.JANUARY.print(); break;
		case 2: Month.FEBRUARY.print(); break;
		case 3: Month.MARCH.print(); break;
		case 4: Month.APRIL.print(); break;
		case 5: Month.MAY.print(); break;
		case 6: Month.JUNE.print(); break;
		case 7: Month.JULY.print(); break;
		case 8: Month.AUGUST.print(); break;
		case 9: Month.SEPTEMBER.print(); break;
		case 10: Month.OCTOBER.print(); break;
		case 11: Month.NOVEMBER.print(); break;
		case 12: Month.DECEMBER.print(); break;
		default : System.out.println("Няма месец, съответсващ на това число.");
		}
		
	}

}
