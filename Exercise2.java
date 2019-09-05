
import java.util.Scanner;

public class Exercise2{
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first digit: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter your second digit: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		System.out.printf("The sum of your number is %d%n", sum);
		
		int multiply = num1 * num2;
		System.out.printf("the product of your number is %d%n", multiply);
		
		int difference = num1 - num2;
		System.out.printf("The difference of your numbers is %d%n", difference);
		
		
		int quotient = num1/num2;
		
		System.out.printf("The qotient of your numbers is %d%n", quotient);
		
	}
}