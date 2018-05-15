package model.broetchen.broetchensorten;
import model.broetchen.Broetchen;

public class HamSesam extends Broetchen {

    public HamSesam () {
        super("Hamburger Sesam", 11, 0.95, true, false, true);
            backzeit = 90;
            hoehe = 2.8;
    }
    public void setHoehe (double broetchensortenHoehe){
        hoehe=broetchensortenHoehe;
    }
}
