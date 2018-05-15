package model.gemuese.gemuesesorten;
import model.gemuese.Gemuese;

public abstract class Jalapeno extends Gemuese {

    public Jalapeno () {
        super("Jalapeno-Ringe", 43, 0.08, false);
            scheibenAnzahl = 5;
            scheibenDicke = 0.2;
    }
    public void setscheibenDicke (double gemuesesortenHoehe){
        scheibenDicke=gemuesesortenHoehe;
    }
}

