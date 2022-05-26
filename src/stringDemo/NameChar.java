package stringDemo;

import java.util.*;

public class NameChar {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String Name1;
		String Name2;

		System.out.println("Input your name:");
		Name1 = kb.nextLine();

		System.out.println("Input your name:");
		Name2 = kb.nextLine();

		int len1 = Name1.length();
		int len2 = Name2.length();

		if (len1 < len2) {
			System.out.println(
					"The lenght of " + Name2 + " is " + len2 + " ,the second name its longer than the first name.");
		} else {
			System.out.println(
					"The lenght of " + Name1 + " is " + len1 + " ,the first name its longer than the second name.");

		}
	}
}
