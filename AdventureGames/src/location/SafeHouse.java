package location;

import charecters.Player;

public class SafeHouse extends NormalLoc {

	public SafeHouse(Player player) {
		super(player, "Güvenli ev");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
		System.out.println("Güvenli evdesin.");
		System.out.println("Canýn yenilendi.");
		this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
		return true;
	}

}
