package secondSemester;

import java.util.Scanner;

 
public class OpeningProblem {
	public static void main (String[]args) {
		Scanner kb = new Scanner(System.in);
		
		double person1;
		double person2;
		double person3;
		double person4;

		System.out.println("Input your height:");
		person1 = kb.nextDouble();

		System.out.println("Input your height:");
		person2 = kb.nextDouble();
		
		System.out.println("Input your height:");
		person3 = kb.nextDouble();
		
		System.out.println("Input your height:");
		person4 = kb.nextDouble();
		
		double totalHeight = + person1 + person2 + person3 + person4;
		double average = totalHeight/4;
		
		System.out.print("The average is " + average);
		
		if (person1 > average) {
			System.out.println(
					"The height is above average");
		} else if (person2 > average) {
			System.out.println(
					"The height is above average");
			
		} else if (person3 > average) {
			System.out.println(
					"The height is above average");
			
		} else if (person4 > average) {
			System.out.println(
					"The height is above average");

		}

	}

}
