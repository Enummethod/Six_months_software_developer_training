import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir Say� Giriniz: ");
		int numb = input.nextInt();
		int total = 0;
		if (numb == 1) {
			System.out.println("1 M�kemmel Say� de�ildir.");
		} else {
			for (int i = 1; i < numb; i++) {
				if (numb % i == 0) {
					total += i;
				}
			}
			if (total == numb) {
				System.out.println(numb + " say�s� M�kemmel bir say�d�r.");
			} else
				System.out.println(numb + " say�s� M�kemmel bir say� de�ildir.");
		}
	}
}