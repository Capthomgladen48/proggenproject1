package model.broetchen;
import model.Zutat;

public abstract class Broetchen extends Zutat {

    public int backzeit; //in Sekunden
    protected double hoehe; //in cm
    protected double broetchensortenHoehe;


    public Broetchen (String name, int nummer, double preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
        super (name, nummer, preis, klassisch, vegan, vegetarisch);
        this.backzeit = backzeit;
        this.hoehe = hoehe;
    }

    public int zubereiten () {

        return 0;
    }

    public double berechneHoehe () {
        return broetchensortenHoehe;
    }
    public double getbroetchensortenHoehe() {
        return broetchensortenHoehe;
    }
}
