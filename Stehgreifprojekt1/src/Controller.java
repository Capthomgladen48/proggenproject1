
public class Controller {

	public static void main (String [] args) {
		
		String action [];
		String line;
		
		System.out.println("Willkommen bei BuildYourBurger!");
		System.out.println("Bitte geben Sie Ihre Bestellung f�r Ihre Lieblingsburger ein.");
		System.out.println("Mit �menu� k�nnen Sie sich die vollst�ndigen Zutaten anzeigen lassen.");
		System.out.println("Mit �zutat� und der jeweiligen Nummer k�nnen Sie eine Zutat ausw�hlen.");
		System.out.println("Mit �ok� k�nnen sie Ihre Burgerzusammenstellung abschlie�en.");
		System.out.println("Mit �meine burger� wird ihre aktuelle Bestellung angezeigt.");
		System.out.println("Mit �bestellen� wird die Bestellung abgeschlossen.");
		System.out.println("Bitte geben Sie ihre W�nsche ein: ");
		line = StaticScanner.nextString();
		action = line.split(" ");
	}
	
	public static void menu () {
		
	}
}
