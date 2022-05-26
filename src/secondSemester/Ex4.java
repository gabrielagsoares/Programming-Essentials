package secondSemester;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		
int nextNumber = 0;
		
		Scanner kb = new Scanner(System.in);
		
		int studentsMark[] = new int[25];
		for (int i = 0; i<25; i++) {
		System.out.println("Input the " +(i+1)+ " student mark: ");
			nextNumber = kb.nextInt();
			studentsMark[i] = nextNumber;	
		}
		for (int i = 0; i<15 ; i++) {
			System.out.println(studentsMark[i]);
		}
	}
}
