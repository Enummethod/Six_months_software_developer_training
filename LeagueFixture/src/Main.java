import java.util.*;

public class Main {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Galatasaray");
		list.add("Bursaspor");
		list.add("Fenerbahçe");
		list.add("Beþiktaþ");
		list.add("Baþakþehir");
		list.add("Trabzonspor");

		FixtureGenerator fixtureGenerator = new FixtureGenerator();
		List<List<Match>> all = fixtureGenerator.getFixtures(list);
		fixtureGenerator.print(all);

	}
}