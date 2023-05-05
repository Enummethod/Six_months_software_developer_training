import java.util.Arrays;
import java.util.Scanner;

public class Max_min {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Girmek Ýstediðiniz Sayý Adedini Giriniz: ");
		int amount = input.nextInt();
		int myArray[] = new int[amount];
		for (int i = 0; i < amount; i++) {
			System.out.print((i + 1) + ". Sayýyý Giriniz: ");
			int a = input.nextInt();
			myArray[i] = a;
		}
		Arrays.sort(myArray);
		System.out.println("Girilen En Büyük Sayý: " + myArray[amount - 1]);
		System.out.println("Girilen En Küçük Sayý: " + myArray[0]);
	}
}
