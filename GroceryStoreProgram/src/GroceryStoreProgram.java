import java.util.Scanner;

public class GroceryStoreProgram {

	private static final float ARMUT_KILO_FIYAT = 2.14f;
	private static final float ELMA_KILO_FIYAT = 3.67f;
	private static final float DOMATES_KILO_FIYAT = 1.11f;
	private static final float MUZ_KILO_FIYAT = 0.95f;
	private static final float PATLICAN_KILO_FIYAT = 5.00f;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float kiloArmut, kiloElma, kiloDomates, kiloMuz, kiloPatlican;
		System.out.print("Armut kac kilo: ");
		kiloArmut = input.nextFloat();
		System.out.print("Elma kac kilo: ");
		kiloElma = input.nextFloat();
		System.out.print("Domates kac kilo: ");
		kiloDomates = input.nextFloat();
		System.out.print("Muz kac kilo: ");
		kiloMuz = input.nextFloat();
		System.out.print("Patlýcan kac kilo: ");
		kiloPatlican = input.nextFloat();
		System.out.print("Toplam Tutar: " + hesapla(kiloArmut, kiloElma, kiloDomates, kiloMuz, kiloPatlican));
	}

	public static float hesapla(float kiloArmut, float kiloElma, float kiloDomates, float kiloMuz, float kiloPatlican) {
		float toplam = 0;
		toplam += (float) (kiloArmut * ARMUT_KILO_FIYAT);
		toplam += (float) (kiloElma * ELMA_KILO_FIYAT);
		toplam += (float) (kiloDomates * DOMATES_KILO_FIYAT);
		toplam += (float) (kiloMuz * MUZ_KILO_FIYAT);
		toplam += (float) (kiloPatlican * PATLICAN_KILO_FIYAT);
		return toplam;
	}

}
