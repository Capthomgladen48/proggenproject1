package model.bratling.bratlingsorten;
import model.bratling.Bratling;

public abstract class Haehnchen extends Bratling {
    public Haehnchen () {
        super("Haehnchen", 21, 1.15, false, false, false);
            bratzeit = 180;
            hoehe = 1.1;
    }
    public void setHoehe (double bratlingsortenHoehe){
        hoehe=bratlingsortenHoehe;
    }
}
