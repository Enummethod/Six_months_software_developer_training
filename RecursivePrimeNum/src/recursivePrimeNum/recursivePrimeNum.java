package recursivePrimeNum;

import java.util.Scanner;

public class recursivePrimeNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Say� giriniz : ");
		n = input.nextInt();

		if (isPrime(n, 2))
			System.out.print(n + " say�s� ASALDIR !");
		else
			System.out.print(n + " say�s� ASAL de�ildir !");
	}

	static boolean isPrime(int n, int i) {
		if (n <= 2)
			return (n == 2) ? true : false; // ternary
		if (n % i == 0)
			return false;
		if (i * i > n)
			return true;

		return isPrime(n, i + 1);
	}
}
