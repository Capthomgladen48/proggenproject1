package model.bratling.bratlingsorten;
import model.bratling.Bratling;

public abstract class Veggie extends Bratling {

    public Veggie() {
        super("Veggie", 21, 1.75, false, false, true);
            bratzeit = 240;
            hoehe = 2.5;
    }
    public void setHoehe (double bratlingsortenHoehe){
        
        hoehe=bratlingsortenHoehe;
    }
}
