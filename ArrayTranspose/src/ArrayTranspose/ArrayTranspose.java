package ArrayTranspose;

import java.util.Scanner;

public class ArrayTranspose {

	public static void main(String[] args) {
		
		int m, n;
		Scanner input = new Scanner(System.in);
		System.out.print("Matrisin sat�r say�s�n� girin : ");
		m = input.nextInt();
		System.out.print("Matrisin sutun say�ss�n� girin : ");
		n = input.nextInt();

		int matrix[][] = new int[m][n];

		System.out.println("Matrisin elemanlar�n� girin");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Matirisin " + (i + 1) + ". sat�r� " + (j + 1) + ". s�tunu eleman�n� girin: ");
				matrix[i][j] = input.nextInt();
			}
		}

		System.out.println("Matris: ");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + "\t");
			}

			System.out.print("\n");
		}

		int transpose[][] = new int[n][m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}

		System.out.println("Matrisin tersi:");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(transpose[i][j] + "\t");
			}

			System.out.print("\n");
		}
	}

}
