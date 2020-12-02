package Demo4;

import fi.jyu.mit.ohj2.Syotto;

/**
 * @author Esa Kesti
 * @version 3 Jul 2020
 */
public class Tehtävä {
        
    /**
     * @param enimi
     * @return eka
     */
    public static String annaEkaSana(String enimi) {
        int paikka = enimi.indexOf(' ');
        String eka = enimi.substring(0, paikka);
        return eka;
    }
    
    /**
     * @param nimi 
     */
    public static void poistaEkaSana(StringBuilder nimi) {       
       int i = nimi.indexOf(" ");
        
        
    }

        
        /**
         * @param args
         */
        public static void main(String[] args) {
            String nimi = Syotto.kysy("Anna sukunimi etunimi");
            StringBuilder sb = new StringBuilder(nimi);
            poistaEkaSana(sb);
            
            System.out.println("Terve, etunimesi on siis " + sb);
            String sukunimi = annaEkaSana(nimi);
            System.out.println("ja sukunimesi on siis " + sukunimi);
        }

    }

}
