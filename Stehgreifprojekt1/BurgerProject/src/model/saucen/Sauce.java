package model.saucen;
import model.Zutat;

public class Sauce extends Zutat {

	private int menge;
	private String geschmack;
	
	public Sauce (String name, int nummer, double preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
		super (name, nummer, preis, klassisch, vegan, vegetarisch);
		this.menge = menge;
		this.geschmack = geschmack;
	}
	
	public int zubereiten () {
        if (nummer == 50){
            System.out.println("Die Ketchup-Sauce wird geschüttelt.");
        } else if (nummer == 51){
            System.out.println("Die Sandwich-Sauce wird geschüttelt.");
        }else if (nummer == 52){
            System.out.println("Die Chili-Sauce wird geschüttelt.");
        }else if (nummer == 53)
            System.out.println("Die Honig-Senf-Sauce wird geschüttelt.");
        return 0;
    	}

	@Override
	public int berechneHoehe() {

		return 0;
	}
}
