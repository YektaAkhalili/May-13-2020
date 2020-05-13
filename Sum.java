import java.util.Scanner;

class Sum{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first, second, sum; 
		System.out.println("Input two numbers: ");
		first = scan.nextInt();
		second = scan.nextInt();
		sum = first + second; 
		
		System.out.println("The sum is: " + sum);
	}
}