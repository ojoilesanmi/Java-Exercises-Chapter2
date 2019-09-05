import java.util.Scanner;

	public class Circle{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the value of your radius: ");
	int radius = input.nextInt();

	System.out.printf("%s%d%s%d%n", "A circle with radius ", radius, " has a diameter of ", (2*radius));
	System.out.printf("%s%d%s%.4f%n", " A circle with radius ", radius, " has a circumference of ", (2 * Math.PI * radius));
	System.out.printf("%s%d%s%.4f%n", " A circle with radius ", radius, " has an area of ", (Math.PI * radius * radius));


}

}