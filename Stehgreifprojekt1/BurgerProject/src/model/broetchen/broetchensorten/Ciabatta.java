package model.broetchen.broetchensorten;
import model.broetchen.Broetchen;

public class Ciabatta extends Broetchen {
    public Ciabatta () {
        super("Ciabatta", 13, 0.45, false, false, true);
            backzeit = 330;
            hoehe = 4.1;
    }
    public void setHoehe (double broetchensortenHoehe){
        hoehe=broetchensortenHoehe;
    }
}
