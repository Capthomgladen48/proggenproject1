package model.broetchen.broetchensorten;
import model.broetchen.Broetchen;

public class Hamburger extends Broetchen {

    public Hamburger () {
        super("Hamburger", 10, 0.85, true, false, true);
            backzeit = 90;
            hoehe = 2.7;
    }
    public void setHoehe (double broetchensortenHoehe){
        hoehe=broetchensortenHoehe;
    }

}
