package model.bratling.bratlingsorten;
import model.bratling.Bratling;

public abstract class Rind extends Bratling {
    public Rind () {
        super("Rindfleisch", 20, 1.85, true, false, false);
            bratzeit = 270;
            hoehe = 2.5;
    }
    public void setHoehe (double bratlingsortenHoehe){
        hoehe=bratlingsortenHoehe;
    }
}
