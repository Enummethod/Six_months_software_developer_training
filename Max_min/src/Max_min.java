import java.util.Arrays;
import java.util.Scanner;

public class Max_min {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Girmek �stedi�iniz Say� Adedini Giriniz: ");
		int amount = input.nextInt();
		int myArray[] = new int[amount];
		for (int i = 0; i < amount; i++) {
			System.out.print((i + 1) + ". Say�y� Giriniz: ");
			int a = input.nextInt();
			myArray[i] = a;
		}
		Arrays.sort(myArray);
		System.out.println("Girilen En B�y�k Say�: " + myArray[amount - 1]);
		System.out.println("Girilen En K���k Say�: " + myArray[0]);
	}
}
