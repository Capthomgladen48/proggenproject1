package model.gemuese.gemuesesorten;
import model.gemuese.Gemuese;

public class Salzgurken extends Gemuese {

    public Salzgurken () {
        super("Salzgurken", 41, 0.15, true);
            scheibenAnzahl = 4;
            scheibenDicke = 0.2;
    }
    public void setscheibenDicke (double gemuesesortenHoehe){
        scheibenDicke=gemuesesortenHoehe;
    }

}
