import java.util.Scanner;

public class Odd{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your integer: ");
	int num = input.nextInt();
	
	if((num % 2 == 0)){
	System.out.print("Thisis an even number");
	}
	
	if(num % 2 != 0){
		System.out.print("This is an odd number");
	}
	}
	}




	
	
	