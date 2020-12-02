package l10;


import fi.jyu.mit.ohj2.*;

/**
 * Ohjelmalla tulostetaan suurin ja pienin kolmesta luvusta
 * @author Esa Kesti
 * @version 27.9.2020
 */
public class SuurinJaPienin {
//#STATICIMPORT

    /**
     * Palautetaan kolmen luvun pienin luku
     * @param a tutkittavat luvut
     * @param b
     * @param c
     * @param d
     * @return pienin luvuista a,b,c
     */
    public static int pienin(int a, int b, int c, int d) {
        int min = a;
        if ( b < min ) min = b;
        if ( c < min ) min = c;
        if ( d < min ) min = d;
        return min;
    }

    /**
     * Palautetaan kolmen luvun suurin luku
     * @param a tutkittavat luvut
     * @param b
     * @param c
     * @return suurin luvuista a,b,c     
     */
    public static int suurin(int a, int b, int c) {
        int max = a;
        if ( max < b ) max = b;
        if ( max < c ) max = c;
        return max;
    }

    
    
    
    
    /**
     * Paluttaa pienimmän luvun annetuista parametreistä
     * @param a eka luku
     * @param b toka luku
     * @param c kolmas luku
     * @return pienin luku
     * 
     * @example
     * <pre name="test">
     * pieninLuku(1, 2, 3) === 1;
     * pieninLuku(1, 3, 2) === 1;
     * pieninLuku(2, 1, 3) === 1;
     * pieninLuku(2, 3, 1) === 1;
     * pieninLuku(3, 1, 2) === 1;
     * pieninLuku(3, 2, 1) === 1;
     * pieninLuku(1, 1, 2) === 1;
     * pieninLuku(3, 2, 2) === 2;
     * </pre>
     */
    public static int pieninLuku(int a, int b, int c) {
        int ehdokas = a;
        if ( b < ehdokas ) ehdokas = b;
        if ( c < ehdokas ) ehdokas = c;
        return ehdokas;
    }
    
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = Syotto.kysy("Anna luku 1", 1);
        a[1] = Syotto.kysy("Anna luku 2", 2);
        a[2] = Syotto.kysy("Anna luku 3", 3);
        a[3] = Syotto.kysy("Anna luku 4", 3);
        int min = pienin(a[0],a[1],a[2],a[3]);        
        System.out.println("Pienin luku:" + min);
        //System.out.printf("Lukujen %d,%d,%d suurin on %d ja pienin on %d.%n",a,b,c,max,min);
        
        
        //int[] a;   // ei ole taulukkoa -> nyt vain viite.

    }


}