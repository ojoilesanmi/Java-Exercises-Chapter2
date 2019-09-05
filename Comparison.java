import java.util.Scanner;


public class Comparison{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Enter your second number: ");
		int secondNumber = input.nextInt();
		
		if(firstNumber == secondNumber){
			System.out.print("Numbers are equal");
		}
		if(firstNumber != secondNumber){
			System.out.print("Numbers are not equal");
		}
	}
}