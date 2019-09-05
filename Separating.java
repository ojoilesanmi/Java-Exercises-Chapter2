import java.util.Scanner;

	public class Separating{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter any 5 digits number of your choice: ");
	int num0= input.nextInt();

	int num1 = num0 / 10000;
	int num2 = num0 / 1000 % 10;
	int num3 = num0 /100 % 10;
	int num4 = num0 / 10 % 10;
	int num5 = num0 % 10;

	System.out.printf("%d   %d    %d    %d    %d   ", num1, num2, num3, num4, num5);
	}
}

	
	
