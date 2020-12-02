package Demo7;

/**
 * 
 * @author Esa Kesti
 * @version 28 Nov 2020
 */
public class Laskekirjaimet {
    
    /**
     * Aliohjelma mik‰ laskee valittujen kirjainten lukum‰‰r‰n 
     * @param sana
     * @param a 
     * @return laskuri laskee esiintyvien merkkien m‰‰r‰n ja palauttaa sen
     */

    
    public static int laskeKirjaimet (String sana, char a ) {
        int laskuri = 0;
        for (int i = 0; i < sana.length(); i++) {
            if (sana.charAt(i) == a) laskuri++;
                
            }
        
        return  laskuri;
    }
    

    /**
     * Ei k‰ytˆss‰
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println(laskeKirjaimet("kissa", 'a'));
        System.out.println(laskeKirjaimet("koira", 'k'));
        System.out.println(laskeKirjaimet("susi", 's'));
        System.out.println(laskeKirjaimet("taateli", 't'));
        System.out.println(laskeKirjaimet("yhdyskuntaseuraamusasiakas", 'a'));

        

        
    }

}
