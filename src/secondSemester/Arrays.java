package secondSemester;

import java.util.*;

public class Arrays {
	public static void main (String[] args) {
		
		int nextNumber = 0;
		
		int array1[] = new int[6];
		double array2[] = {1.3, 2.9, 11.8, 0.1};
		char array3[] = new char[10];
		String array4[] = new String[25];
		
		float floatNumb[] = new float[10];
		char charArray[] = new char[8];
		int intElevenElements[] = new int [11];
		int intElements[] = {123, 156, 77, -9, 78, 21};
		Scanner kb = new Scanner(System.in);
		
		int fiveNumbsArray[] = new int[5];
		for (int i = 0; i<5; i++) {
			System.out.println("Input the number:");
			nextNumber = kb.nextInt();
			fiveNumbsArray[i] = nextNumber;	
		}
		for (int i = 0; i<5 ; i++) {
			System.out.println(fiveNumbsArray[i]);
		}
		
	}

}
