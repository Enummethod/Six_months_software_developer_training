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
		System.out.println("Macera Oyununa Ho�geldin...");
		System.out.print("L�tfen bir isim gir : ");
		String playerName = input.nextLine();
		Player player = new Player(playerName);
		System.out.println(player.getName() + " karekterini se� ve maceraya ba�la...");
		player.SelectChar();
		Location location = null;

		while (true) {
			player.printInfo();
			System.out.println(
					"-------------------------------------------------------------------------------------------------");
			System.out.println(
					"|ID| B�lge        | +++++++++++++++++++++++++++++++A��klama+++++++++++++++++++++++++++++++++++++++++++++++|");
			System.out.println(
					"|1 | G�venli Ev   | Burada hi� d��man yok ve burda tedavi olabilirsin.                                    |");
			System.out.println(
					"|2 | E�ya D�kkan� | Burada birikimlerinle g��l� ekipmanlar alabilirsin.                                   |");
			System.out.println(
					"|3 | Ma�ara       | Bir duyuma g�re Zombiler �s�r�lmadan �nce Ma�arada g�da stoklam��lar.                 |");
			System.out.println(
					"|4 | Orman        | Ate� yakmak iyi bir fikir.Ormandan odun getirebilirsin.Vampirler mi bence bir efsane. |");
			System.out.println(
					"|5 | Nehir        | Hayatta kalmak i�in suya ihityac�n var. Bal�k avlayan ay�lara dikkat et.              |");
			System.out.println(
					"|6 | Maden        | �ans�n yaver giderse Para, Silah ve Z�rh elde edebilirsin.Baz� y�lanlar zehirlidir :D |");
			System.out.println(
					"|0 | Oyun Sonu    | Oyunu sonland�r�r.                                                                    |");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------");
			System.out.print("L�tfen gitmek istedi�iniz b�lgeyi se�iniz : ");

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
				System.out.println("++++Bu macera seni korkuttu mu ? Cesaretini toplay�nca tekrar gel.++++");
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
