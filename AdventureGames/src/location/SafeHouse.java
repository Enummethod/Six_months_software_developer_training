package location;

import charecters.Player;

public class SafeHouse extends NormalLoc {

	public SafeHouse(Player player) {
		super(player, "G�venli ev");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
		System.out.println("G�venli evdesin.");
		System.out.println("Can�n yenilendi.");
		this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
		return true;
	}

}
