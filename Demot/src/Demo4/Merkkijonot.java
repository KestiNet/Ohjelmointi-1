package Demo4;

import fi.jyu.mit.ohj2.*;

/**
 * @author Esa Kesti
 * @version 22 Jun 2020
 */

public class Merkkijonot {

    /**
     * @param args Ei käytössä
     *  ekaSana.length() mittaa sanan pituuden
     */
    public static void main(String[] args) {
        String ekaSana = Syotto.kysy("Anna 1. sana");
        String pidempi = ekaSana;
        int pituus1 = ekaSana.length();
       
        /**
         * @param toinenSana, kysyy toisen sanan käyttäjältä
         * @param toinenSana.length() mittaa sanan pituuden
         */
        String toinenSana = Syotto.kysy("Anna 2. sana");
        String pidempi2 = toinenSana;
        int pituus2 = toinenSana.length();
        
        /**
         * Vertaa sanojen pituutta toisiinsa ja tulostaa pitemmän sanan
         * 
         */
      if (pituus1 > pituus2) System.out.println("Pidempi sana on " + pidempi);
      else System.out.println("Pidempi sana on " + pidempi2);
          
       
    }

    }
