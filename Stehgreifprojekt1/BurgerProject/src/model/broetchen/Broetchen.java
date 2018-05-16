package model.broetchen;
import model.Zutat;

public abstract class Broetchen extends Zutat {

	private int backzeit;
	private int hoehe;
	
	public Broetchen (String name, int nummer, double preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
		super (name, nummer, preis, klassisch, vegan, vegetarisch);
		this.backzeit = backzeit;
		this.hoehe = hoehe;
	}
	
	 public int zubereiten () {
        if (nummer == 10){
            System.out.println("Das Hamburgerbrötchen wird gebacken und benötigt anderthalb Minuten bis es goldbraun ist.");
        } else if (nummer == 11){
            System.out.println("Das Hamburgerbrötchen mit Sesamkörnern wird gebacken und benötigt Minuten bis es goldbraun ist.");
        }else if (nummer == 12){
            System.out.println("Das Vegane Brötchen wird gebacken und benötigt vier Minuten bis es goldbraun ist.");
        }else if (nummer == 13)
            System.out.println("Das Ciabatta Brötchen wird gebacken und benötigt fünf einhalb Minuten bis es goldbraun ist.");

        return backzeit;
    }

    public double berechneHoehe () {
        double broetchenHoehe = (hoehe * 1.02) * backzeit / 60;
        return broetchenHoehe;
    }
}
