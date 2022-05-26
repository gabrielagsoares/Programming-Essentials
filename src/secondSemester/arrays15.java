package secondSemester;
import java.util.*;

public class arrays15 {

	public static void main (String[] args) {
		
		int nextNumber = 0;
		
		Scanner kb = new Scanner(System.in);
		
		int numbsArray[] = new int[15];
		for (int i = 0; i<15; i++) {
			System.out.println("Input the number:");
			nextNumber = kb.nextInt();
			numbsArray[i] = nextNumber;	
		}
		//display the elements of the array line by line in crescent order
		for (int i = 0; i<15 ; i++) {
			System.out.println(numbsArray[i]);
		}
		//displays on the same line
		for (int i = 0; i<15 ; i++) {
			System.out.print(numbsArray[i]);
			System.out.print(" ");
		}
		//display the elements i reverse order
		for (int i = 15 -1; i>=0 ; i--) {
			System.out.println(numbsArray[i]);
		}
	}
}
