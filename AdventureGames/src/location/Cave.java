package location;

import charecters.Player;
import obstacle.Zombie;

public class Cave extends BattleLoc {

	public Cave(Player player) {
		super(player, "Ma�ara", new Zombie(), "Food", 3);
	}
}