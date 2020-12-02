package l9;

import static l9.pienin.pienin;
//import l.9.Pienin; // aiempi tapa tuoda toinen luokka käyttöön

/**
 * Demonstroidaan aliohjelman kutsua toisesta projektista
 * @author Esa Kesti
 * @version 5 Jul 2020
 */
public class Keskiarvo {
    
    /**
     * @param a
     * @param b
     * @return
     */
    public static double keskiarvo (int a, int b) {
        double ka =(a+b)/2.0;
        return ka;
        
        
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        double ka = 0;
        ka = keskiarvo(2,7);
        System.out.println("keskiarvo on " + ka);
    }

}
