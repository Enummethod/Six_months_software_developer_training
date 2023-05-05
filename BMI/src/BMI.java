import java.util.Scanner;

public class BMI {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter length (m) please: ");
		double length = sc.nextDouble();
		System.out.print("Enter weight(kg) please: ");
		double weight = sc.nextDouble();
		double bMI = weight / (Math.pow(length, 2));
		System.out.println("body mass index: " + bMI);
	}
}
