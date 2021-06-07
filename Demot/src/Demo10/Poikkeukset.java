package Demo10;

/**
 * Muutetaan string merkkijonot doubleksi
 * @author esakesti
 * 
 *
 */
public class Poikkeukset {

/**
 * @param 
 * @param muutaJono
 * @param d 
 * @param d1 
 * @param d2 
 * @return t1
 */
public static double muutaJono(String muutaJono, double d) {
	
	double t1 = Double.parseDouble(muutaJono);

	
	return t1;
}



/**
 * @param args
 */
public static void main(String args[]) {
    double d1 = muutaJono("12.3",0.0);
    double d2 = muutaJono("12.3e",0.0);
    
    try {
    System.out.printf("%5.2f %5.2f",d1,d2); // 12.30 0.00
    } catch (NumberFormatException e) {
    	System.out.printf("%5.2f %5.2f",d1 + e.getMessage());
    }
}
}