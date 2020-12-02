package l10;


import fi.jyu.mit.ohj2.*;

/**
 * Ohjelmalla tulostetaan suurin ja pienin kolmesta luvusta
 * @author Esa Kesti
 * @version 27.9.2020
 */
public class SuurinJaPienin4 {
//#STATICIMPORT

    /**
     * Palautetaan kolmen luvun pienin luku
     * @param taulukko tutkittavat luvut
     * @return pienin taulukon luvuista 
     */
    public static int pienin(int [] taulukko) {
        int min = taulukko[0];
        int i = 1;
        int koko = taulukko.length;
        while(i < 4) {
            if(taulukko[i] < min)
                min = taulukko[i];
            i++;
        }
        return min;
    }

    /**
     * Palautetaan kolmen luvun suurin luku
     * @param taulukko 
     * @return suurin luvuista a,b,c     
     */
    public static int suurin(int[] taulukko) {
        if (taulukko.length == 0) return 0;
        
        int max = taulukko[0];
        for (int i = 1; i < taulukko.length; i++)
            if (taulukko[i] > max)
                max = taulukko[i];
            
      
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
        int[] a = new int[9];
        for(int i = 0; i < a.length; i++)
            a[i] = Syotto.kysy("Anna " + (i+1) + ". luku", i+1);
        
        
        int min = pienin(a);     
        int max = suurin(a);
        //System.out.println("Pienin luku:" + min);
        System.out.print("Lukujen ");
        String alkuun = "";
        for(int i = 0; i < a.length; i++) {
            System.out.print(alkuun + a[i] );
            alkuun = ",";

        }
        System.out.printf("suurin on %d ja pienin on %d.%n",max,min);
        
        
        //int[] a;   // ei ole taulukkoa -> nyt vain viite.

    }


}