import java.util.Scanner;

	public class Sphere{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the value of your radius: ");
	int radius = input.nextInt();

	System.out.printf("%s%d%s%d%n", " A sphere with radius ", radius, " has a diameter of ", (2*radius));
	System.out.printf("%s%d%s%.4f%n", " A sphere with with radius ", radius, " has a surface area of ", (4 * Math.PI * radius * radius));
	System.out.printf("%s%d%s%.4f%n", " A sphere with radius ", radius, " has an area of ", (Math.PI * radius * radius));


}

}