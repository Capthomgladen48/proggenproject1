package model.gemuese;
import model.Zutat;

public abstract class Gemuese extends Zutat {

	private int scheibenDicke;
	private int scheibenAnzahl;
	
	public Gemuese (String name, int nummer, double  preis, boolean klassisch) {
		super(name, nummer, preis, klassisch, true, true);
		this.scheibenAnzahl = scheibenAnzahl;
		this.scheibenDicke = scheibenDicke;
	}
	
	 public int zubereiten () {
        int zubereitungszeitGemuese = scheibenAnzahl*1;

        if (nummer == 40){
            System.out.println("Die Tomaten für Ihren Burger werden geschnitten.");
        } else if (nummer == 41){
            System.out.println("Die Salzgurken für Ihren Burger werden geschnitten.");
        }else if (nummer == 42){
            System.out.println("Ihre Roten Zwiebelringe werden klein geschnitten.");
        }else if (nummer == 43)
            System.out.println("Ihre Jalapeno-Ringe werden klein geschnitten.");

        return zubereitungszeitGemuese;
    }

    public double berechneHoehe () {
        return scheibenDicke;
    }
	
//	public String toString () {
//		return String;
//	}
}
