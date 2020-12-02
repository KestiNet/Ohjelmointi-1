package Demo4;

import fi.jyu.mit.ohj2.*;

/**
 * @author Esa Kesti
 * @version 27 Jun 2020
 */
public class Ehtolauseet {
    
   /**
    * Testataan, mikä numeroista on pienin
 * @param a
 * @param b
 * @param c
 * @return palauttaa pienimmän numeron
 */
public static double pienin(double a, double b, double c) {
       if (a < b && b < c)
           return a;
       if (b < a && a < c)
           return b;
       if (c < a && c < b)
           return c;
       return 0;
   }

/**
 * Testataan mikä numeroista on suurin
 * @param a
 * @param b
 * @param c
 * @return palauttaa suurimman numeron
 */
public static double suurin(double a, double b, double c) {
    if (a > b && b > c)
        return a;
    if (b > a && a > c)
        return b;
    if (c > a && c > b)
        return c;
    return 0;
    
}
    /**
     * @param args ei käytössä
     * Pyytää käyttäjää syöttämään kolme kokonaislukua ja tulostaa pienimmän ja suurimmän kokonaisluvun
     */
    public static void main(String[] args) {
        double a = Syotto.kysyDouble("Syötä ensimmäinen kokoainaisluku: ");
        double b = Syotto.kysyDouble("Syötä toinen kokoainaisluku: ");
        double c = Syotto.kysyDouble("Syötä kolmas kokoainaisluku: ");
        
        double p = pienin(a, b, c);
        double s = suurin(a, b, c);
        
        System.out.println("Pienin kokonaisluku on: "  +p);
        System.out.println("Suurin kokonaisluku on: " +s);
    }
    

}
