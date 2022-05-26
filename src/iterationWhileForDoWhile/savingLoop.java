package iterationWhileForDoWhile;

import java.util.*;

public class savingLoop {

	public static void main(String[] args) {
		double balance = 500;

		Scanner sc = new Scanner(System.in);
		System.out.println("Piggy bank for holidays, please insert how much you have to put in");
		System.out.println("Current amount of money " + balance);
		while (balance < 2000) {
			double money;
			System.out.println("Insert how much you want to save: ");
			money = sc.nextDouble();

			System.out.println("Keep putting money until you get there, have faith, almost there!");
			balance = balance + money;
			System.out.println("Bank account balance: " + balance);
		}
		System.out.println("Congratulations, time for holidays, pack your stuff");

	}
}
