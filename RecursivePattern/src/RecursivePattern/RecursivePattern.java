package RecursivePattern;

import java.util.Scanner;

public class RecursivePattern {

	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		System.out.print("Sayýyý giriniz :");
		i = input.nextInt();
		calc(i);
	}

	static void calc(int sayi) {
		int temp = sayi;
		System.out.print(temp);
		while (temp > 0) {
			System.out.print("\t" + (temp -= 5));
		}
		while (temp <= sayi) {
			System.out.print("\t" + (temp += 5));
			if (temp == sayi) {
				break;
			}

		}

	}
}
