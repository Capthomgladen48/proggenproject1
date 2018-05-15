package model.gemuese.gemuesesorten;
import model.gemuese.Gemuese;

public abstract class Zwiebeln extends Gemuese {

    public Zwiebeln () {
        super("Rote Zwiebelringe", 42, 0.08, false);
            scheibenAnzahl = 5;
            scheibenDicke = 0.2;
    }
    public void setscheibenDicke (double gemuesesortenHoehe){
        
        scheibenDicke=gemuesesortenHoehe;
    }
}
