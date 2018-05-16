import java.util.Scanner;

public class Burger {
					
	protected double burgerHoehe;
    	protected double broetchenHoehe;
    	protected double bratlingHoehe;
    	protected double scheibenDicke;

    	public void safeName () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie ihrem Burger einen Namen: ");
        String input = sc.next();
        System.out.println("Ihre Bestellung für den Burger " + input + "wird aufgenommen. ");
        System.out.println("Bitte ihre letzte Eingabe zum Abschließen der Bestellung: ");
        input = sc.next();
        if (input.equals("bestellen")) {
            prepareIngredients();
            addIngredients();
            burgerHeight();
            burgerPrice();
            preperationTime();
        }
	}
	
	public void prepareIngredients () {
		System.out.println("Die Sauce wird geschüttelt.");
        System.out.println("Die .. werden gewaschen.");
        //scheiben schneiden
        System.out.println("Der Salat wird gewaschen.");
        System.out.println("Der Bratling wird ... Minuten lang gebraten.");
        System.out.println("Das Brötchen benötigt ... Minuten zum Aufbacken.");
	}
	
	public void addIngredients () {
		
	}
	
	public void preperationTime() {

        System.out.println("Ihre Bestellung wird in " + mins + "Minuten und " + secs + "Sekunden ausgefliefert");
        System.out.println("Vielen Dank für ihre Bestellung. Wir wünschen einen Guten Appetit.");
	}
	
	public void burgerHeight () {
		return burgerHoehe;
	}
	
	public void burgerPrice () {
		
	}
}
