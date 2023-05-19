import java.util.Scanner;

import charecters.Player;
import location.Cave;
import location.Forest;
import location.Location;
import location.Mine;
import location.River;
import location.SafeHouse;
import location.ToolStore;

public class Game {

	private Scanner input = new Scanner(System.in);

	public void start() {
		System.out.println("Macera Oyununa Hoþgeldin...");
		System.out.print("Lütfen bir isim gir : ");
		String playerName = input.nextLine();
		Player player = new Player(playerName);
		System.out.println(player.getName() + " karekterini seç ve maceraya baþla...");
		player.SelectChar();
		Location location = null;

		while (true) {
			player.printInfo();
			System.out.println(
					"-------------------------------------------------------------------------------------------------");
			System.out.println(
					"|ID| Bölge        | +++++++++++++++++++++++++++++++Açýklama+++++++++++++++++++++++++++++++++++++++++++++++|");
			System.out.println(
					"|1 | Güvenli Ev   | Burada hiç düþman yok ve burda tedavi olabilirsin.                                    |");
			System.out.println(
					"|2 | Eþya Dükkaný | Burada birikimlerinle güçlü ekipmanlar alabilirsin.                                   |");
			System.out.println(
					"|3 | Maðara       | Bir duyuma göre Zombiler ýsýrýlmadan önce Maðarada gýda stoklamýþlar.                 |");
			System.out.println(
					"|4 | Orman        | Ateþ yakmak iyi bir fikir.Ormandan odun getirebilirsin.Vampirler mi bence bir efsane. |");
			System.out.println(
					"|5 | Nehir        | Hayatta kalmak için suya ihityacýn var. Balýk avlayan ayýlara dikkat et.              |");
			System.out.println(
					"|6 | Maden        | Þansýn yaver giderse Para, Silah ve Zýrh elde edebilirsin.Bazý yýlanlar zehirlidir :D |");
			System.out.println(
					"|0 | Oyun Sonu    | Oyunu sonlandýrýr.                                                                    |");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------");
			System.out.print("Lütfen gitmek istediðiniz bölgeyi seçiniz : ");

			int selectLoc = input.nextInt();
			switch (selectLoc) {
			case 0:
				location = null;
				break;
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new ToolStore(player);
				break;
			default:
				location = new SafeHouse(player);
				break;
			case 3:
				location = new Cave(player);
				break;
			case 4:
				location = new Forest(player);
				break;
			case 5:
				location = new River(player);
				break;
			case 6:
				location = new Mine(player);
				break;
			}

			if (location == (null)) {
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("++++Bu macera seni korkuttu mu ? Cesaretini toplayýnca tekrar gel.++++");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			}

			if (!location.onLocation()) {
				System.out.println("GAME OVER!");
				break;
			}
		}
	}
}
