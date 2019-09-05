import java.util.Scanner;

	public class Multiple{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter your second integer: ");
		int num2 = input.nextInt();
		
		
		
		if(num1%num2 == 0){
			if(num1>num2){
			System.out.printf("%d%s%d%n", num1, " is a multiple of ", num2);
			}
		}
		
		if(num2%num1 == 0){
			if(num2>num1){
				System.out.printf("%d%s%d%n", num2, " is a multiple of ", num1);
			}
		}
		
		if(num1%num2 != 0){
			if(num1>num2){
			System.out.printf("%d%s%d%n", num1, " is  not a multiple of ", num2);
			}
		}
		
		
		if(num2%num1 != 0){
			if(num2>num1){
			System.out.printf("%d%s%d%n", num2, " is not a multiple of ", num1);
			}
		}
	
		if(num1==num2){
			if(num1%num2 == 0){
				if(num2==num1){
					if(num2%num1 == 0){
						System.out.print("These integers are equal");
					}
				}
			}
		}
		}
	}
	
		
		
		
		
		
	
	
	
	
	