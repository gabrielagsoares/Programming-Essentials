package stringDemo;

import java.util.Scanner;

//printing a phrase line by line with for

public class ForChar {
	public static void main (String[]args) {
		Scanner kb = new Scanner(System.in);


		String aString = "Welcome to java";



		for (int letter = 0; letter <= 14; letter++) {



			System.out.println(aString.charAt(letter));


		}
	}
}
