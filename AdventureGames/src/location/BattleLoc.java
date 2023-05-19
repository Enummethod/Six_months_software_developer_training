package location;

import java.util.Random;
import java.util.Scanner;

import charecters.Player;
import items.Armor;
import items.Weapon;
import obstacle.Obstacle;

public abstract class BattleLoc extends Location {
	private Obstacle obstacle;
	private String award;
	private int maxObstacle;
	private boolean isAwardCollected;
	private Weapon weaponAward;
	private Armor armorAward;
	private int armorID;
	private int weaponID;

	public Random random = new Random();
	public Scanner input = new Scanner(System.in);

	public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
		super(player, name);
		this.obstacle = obstacle;
		this.award = award;
		this.maxObstacle = maxObstacle;
		setIsAwardCollected(this.getPlayer().getInventory().isAwardCollected(award));
	}

	@Override
	public boolean onLocation() {
		if (this.getPlayer().getInventory().getAwards().size() == 3) {
			System.out.println("Toplaman Gereken her�eyi toplad�n. Oyunu Bitirdin.");
			return false;
		} else {
			if (getIsAwardCollected() == false) {
				int obsNumber = this.randomObstacleNumber();
				System.out.println("�uan bulundu�un yer " + this.getName() + ".");
				System.out.println(
						"Dikkatli ol! Burada " + obsNumber + " adet " + this.getObstacle().getName() + " ya��yor.");
				System.out.print("<S>ava� veya <K>a� : ");
				String selectCase = input.nextLine().toUpperCase();

				if (selectCase.equals("S") && combat(obsNumber)) {
					System.out.println("B�lgedeki t�m d��manlar� yendin !");
					if (this.getName() != "Maden") {
						this.getPlayer().getInventory().setAwards(this.getAward());
					} else {
						mineAward();
						return true;
					}
				} else if (selectCase.equals("V")) {
					return true;
				}

				if (this.getPlayer().getHealth() == 0) {
					return false;
				}
				return true;
			}
		}
		return true;
	}

	public void mineAward() {
		int categoryChance = random.nextInt(1, 100);
		int weaponTypeChance = random.nextInt(1, 100);
		int armorTypeChance = random.nextInt(1, 100);
		int moneyAmountChance = random.nextInt(1, 100);

		if (1 <= categoryChance && categoryChance <= 24) { // %25 drop
			if (1 <= moneyAmountChance && moneyAmountChance <= 19) {
				System.out.println("10 Lira kazand�n.");// %20
				this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
			} else if (20 <= moneyAmountChance && moneyAmountChance <= 49) {
				System.out.println("5 Lira kazand�n."); // %30
				this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
			} else {
				System.out.println("1 Lira kazand�n."); // %50
				this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
			}

		} else if (25 <= categoryChance && categoryChance <= 39) { // %15 drop
			if (1 <= weaponTypeChance && weaponTypeChance <= 19) {
				setWeaponID(1); // %20
			} else if (20 <= weaponTypeChance && weaponTypeChance <= 49) {
				setWeaponID(2); // %30
			} else {
				setWeaponID(3); // %50
			}
			chooseWepon();
		} else if (40 <= categoryChance && categoryChance <= 54) { // %15drop
			if (1 <= armorTypeChance && armorTypeChance <= 19) {
				setArmorID(1); // %20
			} else if (20 <= armorTypeChance && armorTypeChance <= 49) {
				setArmorID(2); // %30
			} else {
				setArmorID(3); // %50
			}
			chooseArmor();
		} else {
			System.out.println("Y�lan hazinesini ele ge�iremedin :("); // %45 drop
		}
	}

	public void chooseWepon() {
		weaponAward = Weapon.getWeaponObjById(getWeaponID());
		System.out.println("Bir " + weaponAward.getName() + " kazand�n. ");
		System.out.print("Silah� ku�anmak i�in <K>'ya bas: ");
		String choose = input.nextLine().toUpperCase();
		if (choose.equals("K")) {
			this.getPlayer().getInventory().setWeapon(weaponAward);
			System.out.println(this.getPlayer().getInventory().getWeapon().getName() + " ku�and�n.");
		}
	}

	public void chooseArmor() {
		armorAward = Armor.getArmorObjById(getArmorID());
		System.out.println("Bir " + armorAward.getName() + " kazand�n. ");
		System.out.print("Z�rh� ku�anmak i�in <K>'ya bas: ");
		String choose = input.nextLine().toUpperCase();
		if (choose.equals("K")) {
			this.getPlayer().getInventory().setArmor(armorAward);
			System.out.println(this.getPlayer().getInventory().getArmor().getName() + " ku�and�n.");
		}
	}

	public boolean combat(int obsNumber) {
		for (int i = 1; i <= obsNumber; i++) {
			this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
			playerStats(i);
			obstacleStats();
			int firstAttack = random.nextInt(1);
			while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
				System.out.print("<V>ur veya <K>a� : ");
				String selectCombat = input.nextLine().toUpperCase();
				if (selectCombat.equals("V")) {
					if (firstAttack == 1) {
						AttackCharecter();
						firstAttack = 0;
					}
					if (firstAttack == 0) {
						AttackObstacle();
						firstAttack = 1;
					}
				} else {
					return false;
				}
			}
		}
		if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
			System.out.println("D��man� Yendin! ");
			if (getObstacle().getName() != "Y�lan") {
				System.out.println(this.getObstacle().getAward() + " Lira kazand�n.");
				this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
				System.out.println("G�ncel paran: " + this.getPlayer().getMoney());
			}
		} else {
			return false;
		}
		return true;
	}

	public void playerStats(int i) {
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println(i + "." + this.getObstacle().getName());
		System.out.println("De�erlerin = " + " Sa�l�k : " + this.getPlayer().getHealth() + ", Silah : "
				+ this.getPlayer().getInventory().getWeapon().getName() + ", Hasar : "
				+ this.getPlayer().getTotalDamage() + ", Z�rh : " + this.getPlayer().getInventory().getArmor().getName()
				+ ", Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock() + ", Para : "
				+ this.getPlayer().getMoney());
	}

	public void obstacleStats() {
		System.out.println("Canavar�n De�erleri = " + " Sa�l�k : " + this.getObstacle().getHealth() + ", Hasar : "
				+ this.getObstacle().getDamage() + ", �d�l : " + this.getObstacle().getAward() + ", Canavar Say�s� : "
				+ this.getMaxObstacle());
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
	}

	public void AttackObstacle() {
		if (this.getObstacle().getHealth() > 0) {
			System.out.println("Canavar sana vurdu!");
			int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
			if (obstacleDamage < 0) {
				obstacleDamage = 0;
			}
			this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
			afterHit();
		}
	}

	public void AttackCharecter() {
		System.out.println("Sen canavara vurdun!");
		this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
		afterHit();
	}

	public void afterHit() {
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println("Can�n : " + this.getPlayer().getHealth());
		System.out.println(this.getObstacle().getName() + " can� : " + this.getObstacle().getHealth());
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
	}

	public int randomObstacleNumber() {
		Random rnd = new Random();
		return rnd.nextInt(this.maxObstacle) + 1;
	}

	public Obstacle getObstacle() {
		return obstacle;
	}

	public void setObstacle(Obstacle obstacle) {
		this.obstacle = obstacle;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public int getMaxObstacle() {
		return maxObstacle;
	}

	public void setMaxObstacle(int maxObstacle) {
		this.maxObstacle = maxObstacle;
	}

	public boolean getIsAwardCollected() {
		return isAwardCollected;
	}

	public void setIsAwardCollected(boolean isAwardCollected) {
		this.isAwardCollected = isAwardCollected;
	}

	public int getWeaponID() {
		return weaponID;
	}

	public void setWeaponID(int weaponID) {
		this.weaponID = weaponID;
	}

	public int getArmorID() {
		return armorID;
	}

	public void setArmorID(int armorID) {
		this.armorID = armorID;
	}
}