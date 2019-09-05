import java.util.Scanner;

	public class Multiplications{
		public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int num1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int num2 = input.nextInt();

	int multiply = num1 * num2;

	System.out.printf("Your answer is %d%n", multiply);
	
	}
}