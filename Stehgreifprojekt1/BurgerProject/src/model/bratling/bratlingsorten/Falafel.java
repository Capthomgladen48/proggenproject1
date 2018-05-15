package model.bratling.bratlingsorten;
import model.bratling.Bratling;

public abstract class Falafel extends Bratling {

    public Falafel () {
        super("Falafel", 22 , 1.45, false, true, true);
            bratzeit = 210;
            hoehe = 2.1;
    }
    public void setHoehe (double bratlingsortenHoehe){
        hoehe=bratlingsortenHoehe;
    }
}
