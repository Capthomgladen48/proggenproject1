package model.salate;

import model.Zutat;

public class Salat extends Zutat {

	public Salat (String name, int nummer, double preis, boolean klassisch) {
		super (name, nummer, preis, klassisch, true, true);
	}
	
	 public int zubereiten () {
        if (nummer == 30){
            System.out.println("Der Eisbergsalat wird gewaschen.");
        } else if (nummer == 31)
            System.out.println("Der Rucola Salat wird gewaschen.");

        return 0;

    }

//	public string toString () {
//		return string;
//	}

	@Override
	public int berechneHoehe() {
		return 0;
	}
}
