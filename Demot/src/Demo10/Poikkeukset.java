package Demo10;

/**
 * Muutetaan string merkkijonot doubleksi
 * @author esakesti
 * 
 *
 */
public class Poikkeukset {


/**
 * Muuttaa String arvon double:ksi ja tekee poikkeuksen tarkistuksen ennen arvon palauttamista
 * @param muutaJono
 * @param oletus
 * @return oletus palautetaan double muodossa
 */
public static double muutaJono(String muutaJono, double oletus) {

	try {
		oletus = Double.parseDouble(muutaJono);
	}
		catch (NumberFormatException e) {
		    System.out.println("Väärä arvo mukana " + e.getMessage());
}
	
	return oletus;
}



/**
 * @param args
 */
public static void main(String args[]) {
    double d1 = muutaJono("12.3",0.0);
    double d2 = muutaJono("12.3e",0.0);
    
   
    System.out.printf("%5.2f %5.2f",d1,d2); // 12.30 0.00
 

}
}