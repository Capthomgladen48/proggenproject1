package model.broetchen.broetchensorten;
import model.broetchen.Broetchen;

public class VeganBroetchen extends Broetchen {

    public VeganBroetchen () {
        super("Veganes Brötchen", 12, 0.95, false, true, true);
            backzeit = 240;
            hoehe = 3.4;
    }
    public void setHoehe (double broetchensortenHoehe){
        hoehe=broetchensortenHoehe;
    }
}
