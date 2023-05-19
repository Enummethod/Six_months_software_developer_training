package location;

import java.util.Random;

import charecters.Player;
import obstacle.Snake;

public class Mine extends BattleLoc {
	static Random rnd = new Random();
	static int damage = rnd.nextInt(3) + 3;

	public Mine(Player player) {
		super(player, "Maden", new Snake(damage), "Nesne", 2);

	}

}
