 
 import java.util.Scanner;
 
 public class ComparingIntegers{
 
 public static void main (String[] args){
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.print("Enter your first integer: ");
	 int num1 = input.nextInt();
	 
	 System.out.print("Enter your second integer: ");
	 int num2 = input.nextInt();
	 
	 if(num1 < num2){
		 System.out.printf("%d%s%n", num2, " is larger");
	 }
	 
	 if(num1 > num2){
		 System.out.printf("%d%s%n", num1, " is larger");
	 }
	 
	 if(num1 == num2){
		 System.out.println("These numbers are equal");
	 }
 }
 }
 
 
 