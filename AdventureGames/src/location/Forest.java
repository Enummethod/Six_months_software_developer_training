package location;

import charecters.Player;
import obstacle.Vampire;

public class Forest  extends BattleLoc{

	public Forest(Player player) {
		super(player, "Orman", new Vampire(), "Firewood",3 );
	}
}
