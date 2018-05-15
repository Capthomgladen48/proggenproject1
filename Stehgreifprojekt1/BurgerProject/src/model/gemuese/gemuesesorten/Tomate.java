package model.gemuese.gemuesesorten;
import model.gemuese.Gemuese;

public class Tomate extends Gemuese {

    public Tomate () {
        super("Tomate", 40, 0.25, true);
            scheibenAnzahl = 3;
            scheibenDicke = 0.3;
    }
    public void setscheibenDicke (double gemuesesortenHoehe){
        
        scheibenDicke=gemuesesortenHoehe;
    }
}
