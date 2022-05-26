package iterationWhileForDoWhile;
import java.util.*;

public class MyBankBalance {

	public static void main(String[] args) {
		double bankBalance = 2000.00;

		Scanner kb = new Scanner(System.in);

		// we should stop when my bankBalance <=0
		while (bankBalance > 0) {
			System.out.println("How much you want withdraw: ");
			double amount = kb.nextDouble();

			if (amount <= bankBalance) {
				bankBalance -= amount;
				System.out.println("Your balance now is: " + bankBalance);

			} else {
				System.out.println("You need: " + (amount - bankBalance));
				System.out.println("You dont have enough money, please insert another value: ");
			}
			
			//
		}
	}

}
