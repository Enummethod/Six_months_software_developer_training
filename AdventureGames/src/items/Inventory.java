package items;

import java.util.ArrayList;

public class Inventory {
	private Weapon weapon;
	private Armor armor;
	private int collectedItemNum = 0;
	private ArrayList<String> awards = new ArrayList<String>();

	public Inventory() {
		this.weapon = new Weapon("Yumruk", -1, 0, 0);
		this.armor = new Armor("нч Giysi", -1, 0, 0);
	}

	public boolean isAwardCollected(String awardOfLoc) {
		for (String award : awards) {
			if (award.equals(awardOfLoc)) {
				return true;
			}
		}
		return false;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public ArrayList<String> getAwards() {
		return awards;
	}

	public void setAwards(String award) {
		awards.add(collectedItemNum, award);
		collectedItemNum++;
	}
}

