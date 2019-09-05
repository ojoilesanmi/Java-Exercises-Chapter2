import java.util.Scanner;

public class Sl{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your first integer: ");
	int num1 = input.nextInt();
	
	System.out.print("Enter your second  integer: ");
	int num2 = input.nextInt();
	
	System.out.print("Enter your third integer: ");
	int num3 = input.nextInt();
	
	 if(num1 < num2 && num1 < num3){
	 System.out.printf("%d%s%n", num1, " is the smallest number");
	 }
	 
	 if(num2 < num1 && num2 < num3){
	 System.out.printf("%d%s%n", num2, " is the smallest number");
	 }
	 
	 if(num3 < num1 && num3 < num2){
	 System.out.printf("%d%s%n", num3, " is the smallest number");
	 }
	 
	 if(num1 > num2 && num1 > num3){
	 System.out.printf("%d%s%n", num1, " is the largest number");
	 }
	 
	 if(num2 > num1 && num2 > num3){
	 System.out.printf("%d%s%n", num2, " is the largest number");
	 }
	
	if(num3 > num1 && num3 > num2){
	System.out.printf("%d%s%n", num3, " is the largest number");
	}


	
	System.out.print("The sum of your numbers is " + (num1+num2+num3) + "\n" );
	
	System.out.print("The product of your integers is " + (num1 * num2 * num3) + "\n");
	
	System.out.print("The average of the three integrs is " + ((num1 + num2 + num3)/3) +"\n");
	}
	}
	