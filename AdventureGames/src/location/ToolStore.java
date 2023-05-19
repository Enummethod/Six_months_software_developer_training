package location;

import charecters.Player;
import items.Armor;
import items.Weapon;

public class ToolStore extends NormalLoc {

	public ToolStore(Player player) {
		super(player, "Maðaza");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
		boolean showMenu = true;
		while (showMenu) {
			System.out.println("---------------------------");
			System.out.println("|  Maðazaya Hoþgeldiniz.  |");
			System.out.println("---------------------------");
			System.out.println("|ID |________iþlem________|");
			System.out.println("|1  |    Silah Satýn al   |");
			System.out.println("|2  |    Zýrh  Satýn al   |");
			System.out.println("|3  |    Çýkýþ            |");
			System.out.println("---------------------------");
			System.out.print("Seçiminiz : ");
			int selectCase = Location.input.nextInt();

			while (selectCase < 1 || selectCase > 3) {
				System.out.println("Geçersiz deðer, tekrar giriniz : ");
				selectCase = input.nextInt();
			}
			switch (selectCase) {
			case 1:
				printWeapon();
				buyWeapon();
				break;
			case 2:
				printArmor();
				buyArmor();
				break;
			case 3:
				System.out.println("Tekrar Bekleriz.");
				showMenu = false;
				break;
			}
		}
		return true;
	}

	private void printWeapon() {
		String ek = "";
		System.out.println("-----------------------------");
		System.out.println("|ID| Silah | Hasar |  Fiyat |");
		for (Weapon weapon : Weapon.weapons()) {
			switch (weapon.getName().length()) {
			case 6:
				ek = " ";
				break;
			case 5:
				ek = "  ";
				break;
			case 4:
				ek = "   ";
				break;
			case 3:
				ek = "    ";
				break;
			}
			System.out.println("|" + weapon.getId() + " |" + weapon.getName() + ek + "|   " + weapon.getDamage()
					+ "   |   " + weapon.getPrice() + "   |");
		}
		System.out.println("|0 |" + "+++++++Çýkýþ yap++++++++|");
	}

	public void buyWeapon() {
		System.out.println("-----------------------------");
		System.out.print("Lütfen bir silah seçiniz : ");
		int selectWeaponID = input.nextInt();
		while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
			System.out.println("Geçersiz deðer, tekrar giriniz : ");
			selectWeaponID = input.nextInt();
		}
		if (selectWeaponID != 0) {
			Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
			if (selectedWeapon != null) {
				if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("!Yeterli paranýz yok!");
				} else {
					System.out.println(selectedWeapon.getName() + "'ý satýn aldýnýz. ");
					int balace = this.getPlayer().getMoney() - selectedWeapon.getPrice();
					this.getPlayer().setMoney(balace);
					System.out.println("Kalan paranýz : " + getPlayer().getMoney());
					System.out.print(this.getPlayer().getInventory().getWeapon().getName() + " ");
					this.getPlayer().getInventory().setWeapon(selectedWeapon);
					System.out.println(this.getPlayer().getInventory().getWeapon().getName() + "'ý ile deðiþtirildi.");
				}
			}
		}
	}

	private void printArmor() {
		String ek = "";
		System.out.println("-----------------------------");
		System.out.println("|ID|   Zýrh   | Blok  |  Fiyat |");
		for (Armor armor : Armor.armors()) {
			switch (armor.getName().length()) {
			case 6:
				ek = "    ";
				break;
			case 7:
				ek = "   ";
				break;
			case 8:
				ek = "  ";
				break;
			case 9:
				ek = " ";
				break;
			case 10:
				ek = "";
				break;
			}
			System.out.println("|" + armor.getId() + " |" + armor.getName() + ek + "|   " + armor.getBlock() + "   |   "
					+ armor.getPrice() + "   |");
		}
		System.out.println("|0 |" + "++++++++++Çýkýþ yap++++++++|");
	}

	public void buyArmor() {
		System.out.println("-----------------------------");
		System.out.print("Lütfen bir silah seçiniz : ");
		int selectArmorID = input.nextInt();
		while (selectArmorID < 0 || selectArmorID > Weapon.weapons().length) {
			System.out.println("Geçersiz deðer, tekrar giriniz : ");
			selectArmorID = input.nextInt();
		}

		if (selectArmorID != 0) {
			Armor selectedArmor = Armor.getArmorObjById(selectArmorID);
			if (selectedArmor != null) {
				if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("!Yeterli paranýz yok!");
				} else {
					System.out.println(selectedArmor.getName() + "'ý satýn aldýnýz. ");
					int balace = this.getPlayer().getMoney() - selectedArmor.getPrice();
					this.getPlayer().setMoney(balace);
					System.out.println("Kalan paranýz : " + getPlayer().getMoney());
					System.out.print(this.getPlayer().getInventory().getArmor().getName() + " ");
					this.getPlayer().getInventory().setArmor(selectedArmor);
					System.out.println(this.getPlayer().getInventory().getArmor().getName() + "'ý ile deðiþtirildi.");
				}
			}
		}

	}

}
