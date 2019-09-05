import java.util.Scanner;

	public class FullName{
		public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your first name: ");
	String name1 = input.nextLine();

	System.out.print("Enter your last name: ");
	String name2 = input.nextLine();

	String name = name1 + " " + name2;

	System.out.printf("Your name is  %s%n%s%n ", name , name);
	
	}
}