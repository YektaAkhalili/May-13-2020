import java.util.Scanner;

class NumManip{
	public static void main(String[] args) {
		int number; 
		Scanner scan = new Scanner(System.in);

		System.out.println("Give me a number and I'll square it: ");
		number = scan.nextInt();

		int square; 
		square = number * number;

		System.out.println("Here's the square: " + square);
		
	}
}

//This is a monumental moment, because I wrote this whole thing on my freaking own! 
