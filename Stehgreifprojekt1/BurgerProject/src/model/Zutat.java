ackage model;

public abstract class Zutat {

    protected String name;
    protected int nummer;
    protected double  preis;
    protected boolean klassisch;
    protected boolean vegan;
    protected boolean vegetarisch;
    protected double burgerHoehe;
    protected double broetchenHoehe;
    protected double bratlingHoehe;
    protected double scheibenDicke;



    public Zutat (String name, int nummer, double preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
        this.name = name;
        this.nummer = nummer;
        this.preis = preis;
        this.klassisch = klassisch;
        this.vegan = vegan;
        this.vegetarisch = vegetarisch;
    }

    public abstract int zubereiten ();


    public double berechneHoehe (){
        burgerHoehe = broetchenHoehe + bratlingHoehe + scheibenDicke;
        return burgerHoehe;
    }

    public double getPreis() {
        return preis;
    }
}
