package ArrayOrder;

import java.util.Scanner;

public class ArrayOrder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin boyutu n : ");
		int n = input.nextInt();
		int[] dizi = new int[n];
		System.out.println("Dizinin elemanlarýný giriniz : ");
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + ". Elemaný : ");
			dizi[i] = input.nextInt();
		}
		int tmp = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (dizi[j] < dizi[i]) {
					tmp = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = tmp;
				}
			}
		}
		System.out.print("Sýralama : ");
		for (int i : dizi) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
}
