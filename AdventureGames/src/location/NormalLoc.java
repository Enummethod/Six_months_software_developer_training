package location;

import charecters.Player;

public abstract class NormalLoc extends Location {

	public NormalLoc(Player player, String name) {
		super(player, name);
	}

	@Override
	public boolean onLocation() {
		// TODO Auto-generated method stub
		return true;
	}

}
