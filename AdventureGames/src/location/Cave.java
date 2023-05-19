package location;

import charecters.Player;
import obstacle.Zombie;

public class Cave extends BattleLoc {

	public Cave(Player player) {
		super(player, "Maðara", new Zombie(), "Food", 3);
	}
}