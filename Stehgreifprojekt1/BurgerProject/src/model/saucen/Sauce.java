package model.saucen;
import model.Zutat;

public class Sauce extends Zutat {

    public int menge; //in Milliliter
    public String geschmack;

    public Sauce (String name, int nummer, double preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
        super (name, nummer, preis, klassisch, vegan, vegetarisch);
        this.menge = menge;
        this.geschmack = geschmack;
    }

    @Override
    public int zubereiten () {

        return 0;
    }

    @Override
    public double berechneHoehe() {

        return 0;
    }
}
