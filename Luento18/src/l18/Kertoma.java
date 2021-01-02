package l18;


/**
 * Esitellään rekursiota, ei parasta tapaa laskea kertoma.
 * @author veli.tornikoski
 * @version 04.05.2020
 */
public class Kertoma {
// #STATICIMPORT
    /**
     * Lasketaan luvun kertoma kaavasta
     * <pre>
     *  0! = 1            
     *  1! = 1
     *  n! = n*(n-1)!;      n! = 1*2*3*...*n-1*n  52! = 8*10^68
     * </pre>
     * @param n minkä luvun kertoma lasketaan
     * @return n!
     * @example
     * <pre name="test">
     *   kertoma(0) === 1;
     *   kertoma(1) === 1;
     *   kertoma(2) === 2;
     *   kertoma(3) === 6;
     *   kertoma(5) === 120;
     *   kertoma(6) === 720;
     * </pre>
     */
    public static long kertoma(int n) {
        if ( n <= 1 ) return 1;
        return n*kertoma(n-1);
    }
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        long k = kertoma(3);
        System.out.println(k);
    }

}