package model.gemuese;
import model.Zutat;

public abstract class Gemuese extends Zutat {

    public double scheibenDicke; //in cm
    protected int scheibenAnzahl; //Anzahl der Scheiben/Ringe
    protected double gemuesesortenHoehe;


    public Gemuese (String name, int nummer, double  preis, boolean klassisch) {
        super(name, nummer, preis, klassisch, true, true);
        this.scheibenAnzahl = scheibenAnzahl;
        this.scheibenDicke = scheibenDicke;
    }

    public int zubereiten () {
        int zubereitungszeit = scheibenAnzahl*1;
        return zubereitungszeit;
    }

    public double berechneHoehe () {
        return gemuesesortenHoehe;
    }
    public double getgemuesesortenHoehe() {
        return gemuesesortenHoehe;
    }

//	public String toString () {
//		return String;
//	}
}
