package stringDemo;

public class StringDemo {
// Displays the length of the variable 
	public static void main(String[] args){
		String hello;
		
		hello =  "Hello World";
		int len = hello.length();
		System.out.print("The length of " + hello + " is " + len);
	}
}
