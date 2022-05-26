package IndividualProject;

/* GABRIELA GOMES SOARES 
 * STUDENT ID 25690 */

//import for user interaction
import java.util.Scanner;

//class creation in java
public class BloodTypeComp {
	// static void function that keep the strings
	public static void main(String args[]) {
		// scanner sc to receive the user input
		Scanner sc = new Scanner(System.in);

		// creation of a string type variable that keeps the blood type , pattern z
		// while to check if there is 2 blood types
		String bloodType = "z";
		// variable created to donate blood
		String donate;
		// string varible to get the blood donation
		String receive;

		// loop to verify if the blood types are correct
		while (bloodType != "A+" || bloodType != "A-" || bloodType != "B+" || bloodType != "B-" || bloodType != "AB+"
				|| bloodType != "AB-" || bloodType != "O+" || bloodType != "O-") {
			// screen print asking the user the blood type
			System.out.println("Enter the blood type: ");
			// toUpperCase() to keep everything that the user is typing in capital letters
			bloodType = sc.nextLine().toUpperCase();

			// if to the blood type equals to A+
			if (bloodType.equals("A+")) {
				// donate is a variable to verify donations option in the function
				// verifyOptions()
				donate = "A+, AB+";
				// receive shows the blood type options and send it to the function
				// verifyOptions()
				receive = "A+, A-, O+, O-";
				// verifyOptions is a function that get the parameters donate, receive and
				// bloodType
				verifyOptions(donate, receive, bloodType);
				// break to stop the loop/while
				break;
			}

			// if condition to the blood type equals to A-
			if (bloodType.equals("A-")) {
				// donate is a variable to verify donations option in the function
				// verifyOptions()
				donate = "A+, AB+, A-, AB- ";
				// receive shows the blood type options and send it to the function
				// verifyOptions()
				receive = "A-, O- ";
				// verifyOptions is a function that get the parameters donate, receive and
				// bloodType
				verifyOptions(donate, receive, bloodType);
				// break to stop the loop/while
				break;
			}

			// if condition to the blood type equals to B+
			if (bloodType.equals("B+")) {
				// donate is a variable to verify donations option in the function
				// verifyOptions()
				donate = "B+, AB+";
				// receive shows the blood type options and send it to the function
				// verifyOptions()
				receive = "B+, B-, O+, O-";
				// verifyOptions is a function that get the parameters donate, receive and
				// bloodType
				verifyOptions(donate, receive, bloodType);
				// break to stop the loop/while
				break;
			}

			// condition to the blood type equals to B-
			if (bloodType.equals("B-")) {
				// donate is a variable to verify donations option in the function
				// verifyOptions()
				donate = "B+, B-, AB+ and AB-";
				// receive shows the blood type options and send it to the function
				// verifyOptions()
				receive = "B- and O- ";
				// verifyOptions is a function that get the parameters donate, receive and
				// bloodType
				verifyOptions(donate, receive, bloodType);
				// break to stop the loop/while
				break;
			}

			// if condition to the blood type equals to AB+
			if (bloodType.equals("AB+")) {
				// donate is a variable to verify donations option in the function
				// verifyOptions()
				donate = "AB+ ";
				// receive shows the blood type options and send it to the function
				// verifyOptions()
				receive = "all types ";
				// verifyOptions is a function that get the parameters donate, receive and
				// bloodType
				verifyOptions(donate, receive, bloodType);
				// break to stop the loop/while
				break;
			}

			// condition to the blood type equals to AB-
			if (bloodType.equals("AB-")) {
				// donate is a variable to verify donations option in the function
				// verifyOptions()
				donate = "AB+, AB-";
				// receive shows the blood type options and send it to the function
				// verifyOptions()
				receive = "AB-, A-, B-, O-";
				// verifyOptions is a function that get the parameters donate, receive and
				// bloodType
				verifyOptions(donate, receive, bloodType);
				// break to stop the loop/while
				break;
			}

			// condition to the blood type equals to O+
			if (bloodType.equals("O+")) {
				// donate is a variable to verify donations option in the function
				// verifyOptions()
				donate = "O+, A+, B+, AB+ ";
				// receive shows the blood type options and send it to the function
				// verifyOptions()
				receive = "O+, O-";
				// verifyOptions is a function that get the parameters donate, receive and
				// bloodType
				verifyOptions(donate, receive, bloodType);
				// break to stop the loop/while
				break;
			}

			// condition to the blood type equals to O-
			if (bloodType.equals("O-")) {
				// donate is a variable to verify donations option in the function
				// verifyOptions()
				donate = "all types";
				// receive shows the blood type options and send it to the function
				// verifyOptions()
				receive = "O-";
				// verifyOptions is a function that get the parameters donate, receive and
				// bloodType
				verifyOptions(donate, receive, bloodType);
				// break to stop the loop/while------------------------------
				break;
			}
			// screen print message that shows if the user inputs is different of the
			// created blood types
			System.out.println("The blood type doesn’t exist, please enter a valid blood type.");
		}
	}

	// function to get parameters sents by he conditions if
	private static void verifyOptions(String donate, String receive, String bloodType) {
		// scanner input integer
		Scanner sc = new Scanner(System.in);
		// variable initialized
		int numberBlood = 0;

		// loop to verify if numberBlood is different of 1 or 2, if it is
		// stills in the loop till the user input 1 or 2
		while (numberBlood != 1 || numberBlood != 2) {
			// screen print to the user input 1 to the types that can donate, 2 for types
			// that can get
			System.out.println("Input 1 to Gives, or 2 to Receives: ");
			// user input
			numberBlood = sc.nextInt();
			// if is = 1
			if (numberBlood == 1) {
				// shows the user blood type and to who is possible to donate
				System.out.println("The blood type for " + bloodType + " to give are: " + donate);
				// break to stop the loop/while
				break;
				// if is = 2
			} else if (numberBlood == 2) {
				// shows the user blood type and who can gets the blood
				System.out.println("The blood type for " + bloodType + " to receive are " + receive);
				// break to stop the loop/while
				break;
			}
			// screen print if user input anything different of 1 ou 2
			System.out.println("Error, please try again!");
		}
	}
}
