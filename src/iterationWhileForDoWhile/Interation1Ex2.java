package iterationWhileForDoWhile;

import java.util.*;

public class Interation1Ex2 {

	public static void main(String[] args) {
		int kNumber = 0;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Insert your 3 digits: ");
			kNumber = sc.nextInt();
		} while (kNumber <= 99 || kNumber >= 1000);

		System.out.println("Your 3 digits is: " + kNumber);
	}
}
