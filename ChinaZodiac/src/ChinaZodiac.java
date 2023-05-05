
import java.util.Scanner;

public class ChinaZodiac {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter your year of birth: ");
		int year = sc.nextInt();
		if (year % 12 == 0) {
			System.out.println("Monkey");
		} else if (year % 12 == 1) {
			System.out.println("Cock");
		} else if (year % 12 == 2) {
			System.out.println("Dog");
		} else if (year % 12 == 3) {
			System.out.println("Pig");
		} else if (year % 12 == 4) {
			System.out.println("mouse");
		} else if (year % 12 == 5) {
			System.out.println("OX");
		} else if (year % 12 == 6) {
			System.out.println("Tiger");
		} else if (year % 12 == 7) {
			System.out.println("Rabbit");
		} else if (year % 12 == 8) {
			System.out.println("Dragon");
		} else if (year % 12 == 9) {
			System.out.println("Snake");
		} else if (year % 12 == 10) {
			System.out.println("Horse");
		} else if (year % 12 == 11) {
			System.out.println("Sheep");
		}
	}
}
