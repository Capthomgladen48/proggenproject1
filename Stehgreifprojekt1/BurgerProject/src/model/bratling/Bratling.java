package model.bratling;
import model.Zutat;

public abstract class Bratling extends Zutat {

    public int bratzeit; //in Sekunden
    protected double hoehe; //in cm


    public Bratling(String name, int nummer, double preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
        super(name, nummer, preis, klassisch, vegan, vegetarisch);
        this.bratzeit = bratzeit;
        this.hoehe = hoehe;
    }
    public int zubereiten () {
        if (nummer == 20){
            System.out.println("Das Rindfleischpatty wird gebraten und ist in vier einhalb Minuten fertig.");
        } else if (nummer == 21){
            System.out.println("Das gegrillte Hähnchenfleisch wird gebraten und ist in drei Minuten fertig.");
        }else if (nummer == 22){
            System.out.println("Der Falafelbratling wird gebraten und ist in drei einhalb Minuten fertig.");
        }else if (nummer == 23)
            System.out.println("Der Gemüse Bratling wird geraten und ist in vier Minuten fertig.");

        return bratzeit;
    }


    public double berechneHoehe () {
        double bratlingHoehe = (hoehe * 0.965) * bratzeit / 60;
        return bratlingHoehe;
    }

}
