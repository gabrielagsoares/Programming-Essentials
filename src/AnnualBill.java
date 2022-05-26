import java.util.*;
public class AnnualBill {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.println("Would you like to use the annual average consuption?"
		+ "Input Y or N");
		String answer = kb.nextLine();

		double annualStandingC = 183.96;
		double annualPSO = 51.60;
		double unitR = 0.2112;
		int avgC = 4200;
		double VAT = 0.135;

		if (answer.equals("Y")) {
			double annualElectricityC = unitR * avgC;
			double totalExcVat = annualStandingC + annualPSO + annualElectricityC;
			double totalVAT = totalExcVat * VAT;
			double Final = (totalExcVat * VAT) + totalExcVat;

			System.out.println("");
			System.out.format("Your Annual Electricity Charge is: %.2f \n", annualElectricityC);
			System.out.format("Total excl VAT: %.2f \n", totalExcVat);
			System.out.format("VAT: 13.5: %.2f \n", totalExcVat * VAT);
			System.out.format("Estimated Annual Bill: %.2f \n", Final);
		}

		else if (answer.equals("N")) {
			System.out.println("Input your annual consuption: ");
			int consC = kb.nextInt();

			double annualElectricityC = unitR * consC;
			double totalExcVat = annualStandingC + annualPSO + annualElectricityC;
			double totalVAT = totalExcVat * VAT;
			double Final = (totalExcVat * VAT) + totalExcVat;

			System.out.println("");
			System.out.format("Your Annual Electricity Charge is: %.2f \n", unitR * consC);
			System.out.format("Total excl VAT: %.2f \n", totalExcVat);
			System.out.format("VAT: 13.5: %.2f \n", totalExcVat * VAT);
			System.out.format("Estimated Annual Bill: %.2f \n", Final);
		}

	}
}