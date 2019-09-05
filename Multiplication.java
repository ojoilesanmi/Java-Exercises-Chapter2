import java.util.Scanner;

	public class Multiplication{
		public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	String name1 = input.nextLine();

	System.out.print("Enter second integer: ");
	String name2 = input.nextLine();

	String fullName = "name1" + "name2";

	System.out.printf("Your answer is ", fullName);
	
	}
}