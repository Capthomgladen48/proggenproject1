package model.bratling;
import model.Zutat;

public abstract class Bratling extends Zutat {

    public int bratzeit; //in Sekunden
    protected double hoehe; //in cm
    protected double bratlingsortenHoehe;

    public Bratling(String name, int nummer, double preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
        super(name, nummer, preis, klassisch, vegan, vegetarisch);
        this.bratzeit = bratzeit;
        this.hoehe = hoehe;
    }
    public int zubereiten () {

        return 0;
    }

    public double berechneHoehe () {
       return bratlingsortenHoehe;
    }
    public double getbratlingsortenHoehe() {
        return bratlingsortenHoehe;
    }
}
