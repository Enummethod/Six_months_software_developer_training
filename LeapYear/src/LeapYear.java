
import java.util.Scanner;

public class LeapYear {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = sc.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println(year + " leapYear");
		else
			System.out.println(year + " not leapYear.");
	}
}
