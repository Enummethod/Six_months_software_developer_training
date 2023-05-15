import java.util.Scanner;

public class ExponentialNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int base, powerRaised;
		System.out.print("Taban de�eri giriniz :");
		base = input.nextInt();
		System.out.print("�s de�ri giriniz : ");
		powerRaised = input.nextInt();

		int result = power(base, powerRaised);

		System.out.println("Sonu�: " + "" + result);
	}

	public static int power(int base, int powerRaised) {
        //recursive
		if (powerRaised != 0) {
			return (base * power(base, powerRaised - 1));
		} else {
			return 1;
		}
	}

}
