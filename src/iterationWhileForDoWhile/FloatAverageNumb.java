package iterationWhileForDoWhile;

import java.util.*;

/* Write a program to input 6 floating-point
   numbers from the keyboard and display their average */

public class FloatAverageNumb {

	public static void main(String[] args) {

		double sum = 0.0;
		Scanner kb = new Scanner(System.in);

		for (int i=1; i <= 6; i++) {
			System.out.println("Please input a flot number: ");
			sum += kb.nextDouble();
		}

		System.out.print("The average is: " + sum / 6);

	}
}
