import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayý Giriniz: ");
		int numb = input.nextInt();
		int total = 0;
		if (numb == 1) {
			System.out.println("1 Mükemmel Sayý deðildir.");
		} else {
			for (int i = 1; i < numb; i++) {
				if (numb % i == 0) {
					total += i;
				}
			}
			if (total == numb) {
				System.out.println(numb + " sayýsý Mükemmel bir sayýdýr.");
			} else
				System.out.println(numb + " sayýsý Mükemmel bir sayý deðildir.");
		}
	}
}