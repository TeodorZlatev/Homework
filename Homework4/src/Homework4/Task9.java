package Homework4;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ДОПЪЛНИТЕЛНА: Намерете броя на необходимите букви за изписването на
		// всички числа между 1 и 1000 (включително) на английски
		int counterLetters = 0;
		for (int number = 1; number <= 1000; number++) {
			System.out.print(number + " - ");
			int counterSpaces = 0;
			String units = null, decimals = null, hundreds = null, thousands = null, tempString = "";
			int hundred = number / 100;
			int decimal = (number / 10) % 10;
			int unit = number % 10;
			if (number == 1000) {
				thousands = "one thousand";
			}
			switch (hundred) {
			case 0:
				break;
			case 1:
				hundreds = "one hundred ";
				break;
			case 2:
				hundreds = "two hundred ";
				break;
			case 3:
				hundreds = "three hundred ";
				break;
			case 4:
				hundreds = "four hundred ";
				break;
			case 5:
				hundreds = "five hundred ";
				break;
			case 6:
				hundreds = "six hundred ";
				break;
			case 7:
				hundreds = "seven hundred ";
				break;
			case 8:
				hundreds = "eight hundred ";
				break;
			case 9:
				hundreds = "nine hundred ";
				break;
			}
			boolean decimalOne = false; // флаг, заради десетиците, дали са
										// равни
										// на 1
			switch (decimal) {
			case 1:
				decimalOne = true;

				switch (unit) {
				case 0:
					decimals = "ten ";
					break;
				case 1:
					decimals = "eleven ";
					break;
				case 2:
					decimals = "twelve ";
					break;
				case 3:
					decimals = "thirteen ";
					break;
				case 4:
					decimals = "fourteen ";
					break;
				case 5:
					decimals = "fifteen ";
					break;
				case 6:
					decimals = "sixteen ";
					break;
				case 7:
					decimals = "seventeen ";
					break;
				case 8:
					decimals = "eighteen ";
					break;
				case 9:
					decimals = "nineteen ";
					break;
				}
				break;
			case 2:
				decimals = "twenty ";
				break;
			case 3:
				decimals = "thirty ";
				break;
			case 4:
				decimals = "fourty ";
				break;
			case 5:
				decimals = "fifthy ";
				break;
			case 6:
				decimals = "sixty ";
				break;
			case 7:
				decimals = "seventy ";
				break;
			case 8:
				decimals = "eighty ";
				break;
			case 9:
				decimals = "ninety ";
				break;
			}
			if (!decimalOne) {
				switch (unit) {
				case 1:
					units = "one";
					break;
				case 2:
					units = "two";
					break;
				case 3:
					units = "three";
					break;
				case 4:
					units = "four";
					break;
				case 5:
					units = "five";
					break;
				case 6:
					units = "six";
					break;
				case 7:
					units = "seven";
					break;
				case 8:
					units = "eight";
					break;
				case 9:
					units = "nine";
					break;
				}
			}

			if (thousands != null) {
				tempString += thousands;
			}
			if (hundreds != null) {
				tempString += hundreds;
			}
			if (decimals != null) {
				tempString += decimals;
			}
			if (units != null) {
				tempString += units;
			}

			System.out.println(tempString);
			for (int i = 0; i < tempString.length(); i++) {
				if (tempString.charAt(i) != ' ') {
					counterLetters++;
				} else {
					counterSpaces++;
				}
			}
			System.out.printf("Общо букви до момента - %d, букви за последното число - %d.\n", counterLetters,
					tempString.length() - counterSpaces);
		}

	}
}
