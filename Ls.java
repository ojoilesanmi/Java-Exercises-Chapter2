import java.util.Scanner;

	public class Ls{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter your second integer: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter your third integer: ");
		int num3 = input.nextInt();
		
		System.out.print("Enter your fourth integer: ");
		int num4 = input.nextInt();
		
		System.out.print("Enter your fifth integer: ");
		int num5 = input.nextInt();
		
		if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
		System.out.printf("%d%s%n", num1, " is the smallest number");
		}
		
		if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
		System.out.printf("%d%s%n", num2, " is the smallest number");
		}
		
		if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
		System.out.printf("%d%s%n", num3, " is the smallest number");
		}
		
		if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
		System.out.printf("%d%s%n", num4, " is the smallest number");
		}
		
		if(num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
		System.out.printf("%d%s%n", num5, " is the smallest number");
		}
		
		if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
		System.out.printf("%d%s%n", num1, " is the largest number");
		}
		
		if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
		System.out.printf("%d%s%n", num2, " is the largest number");
		}
		
		if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
		System.out.printf("%d%s%n", num3, " is the largest number");
		}
		
		if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
		System.out.printf("%d%s%n", num4, " is the largest number");
		}
		
		if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
		System.out.printf("%d%s%n", num5, " is the largest number");
		}
		
		}
	}
	