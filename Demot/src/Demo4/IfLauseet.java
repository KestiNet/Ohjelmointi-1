package Demo4;

import fi.jyu.mit.ohj2.Syotto;

/**
 * harjoitellaan ehtolauseita
 * @author veli.tornikoski
 * @version 13.2.2020
 */
public class IfLauseet {
    
    /**
     * Poistetaan jonon loppu siitä kohti alkaen mistä 
     * löytyy eka katkaisukohta
     * @param jono josta poistetaan ja joka muuttuu aliohjelman aikana
     * @param katkaisukohta kohta jota etsitään. Jos ei löydy, jonolle ei tehdä
     * mitään
     */
    public static void poistaLopusta(StringBuilder jono, String katkaisukohta ) {
        int i = jono.indexOf(katkaisukohta);
        int pituus = jono.length();
        
        if ( i >= 0 )
            jono.delete(i, pituus);
    }
    
    /**
     * Poistetaan jonon loppu siitä kohti alkaen mistä 
     * löytyy välilyönti
     * @param jono josta poistetaan ja joka muuttuu aliohjelman aikana
     * mitään
     */
    public static void poistaLopusta(StringBuilder jono ) {
        int i = jono.indexOf(" ");
        if ( i < 0 )
            return;
        int pituus = jono.length();
        
        if ( i >= 0 )
            jono.delete(i, pituus);
    }
    
    /**
     * Poistetaan jonon loppu siitä kohti alkaen mistä 
     * löytyy välilyönti. Jos ei löydy, lisätään "kana"
     * @param jono josta poistetaan ja joka muuttuu aliohjelman aikana
     * mitään
     */
    public static void poistaLopustaJaLisaa(StringBuilder jono ) {
        int i = jono.indexOf(" ");
        int pituus = jono.length();
        
        if ( i >= 0 )
            jono.delete(i, pituus);
        else 
            jono.append("kana");
    }
    
    /**
     * Poistetaan jonon loppu siitä kohti alkaen mistä 
     * löytyy välilyönti. Jos ei löydy, lisätään "kana"
     * @param jono josta poistetaan ja joka muuttuu aliohjelman aikana
     * mitään
     * @param kohta kohta mistä katkaistaan
     */
    public static void poistaLopustaJaLisaa(StringBuilder jono, String kohta ) {
        int i = jono.indexOf(" ");
        int pituus = jono.length();
        
        if ( i >= 0 ) {
            jono.delete(i, pituus);
            return;
        }
        jono.append("kana");
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
      //int luku = Syotto.kysy("Anna luku", 3);
        //if ( luku > 5 )
        //    System.out.println(luku);
        
        int a=3;
        int b=4;

        if( a < 2 ) {
            System.out.println("a = " + a);
            System.out.println("a = " + a);
        }
        //01234567890
        //kissa istuu
        StringBuilder sbjono = new StringBuilder("kissa istuu");
        StringBuilder sbjono2 = new StringBuilder("kissatalo");
        StringBuilder sbjono3 = new StringBuilder("kissa");
        
        poistaLopusta(sbjono);
        System.out.println(sbjono);
        
        poistaLopusta(sbjono2, "t");
        System.out.println(sbjono2);
       
        poistaLopustaJaLisaa(sbjono3);
        System.out.println(sbjono3);
       
        
        


        
    }

}