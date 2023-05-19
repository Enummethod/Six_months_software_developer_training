package location;

import charecters.Player;
import obstacle.Bear;

public class River extends BattleLoc {

	public River(Player player) {
		super(player, "Nehir", new Bear(), "Water",2);
	}

}