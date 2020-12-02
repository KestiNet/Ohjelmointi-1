package Demo7;

/**
 * Ohjelmalla lasketaan jonossa olevien kirjainten lukum‰‰ri‰
 * @author vesal
 * @version 27.9.2008
 */
public class Kirjaimet {

    /**
     * Aliohjelmalla lasketaan kuinka monta kertaa kirjain
     * esiintyy jonossa.
     * @param jono tutkittava jono
     * @param kirjain etsitt‰v‰ kirjain
     * @return kuinka monesti kirjain esiintyi
     * @example
     * <pre name="test">
     *   laskeKirjaimet("kissa",'s') === 2;
     *   laskeKirjaimet("kissa",'k') === 1;
     *   laskeKirjaimet("kissa",'a') === 1;
     *   laskeKirjaimet("kissa",'p') === 0;
     *   laskeKirjaimet("a",'a')     === 1;
     *   laskeKirjaimet("",'a')      === 0;
     * </pre>
     */
    public static int laskeKirjaimet(String jono, char kirjain) {
        int lkm = 0;
        for (int i=0; i<jono.length(); i++) {
            if ( jono.charAt(i) == kirjain )
                lkm++; 
        }
        return lkm;
    }

    
    /**
     * @param args ei k‰ytˆss‰
     */
    public static void main(String[] args) {
        System.out.printf("%d%n",laskeKirjaimet("kissa",'s'));
        System.out.printf("%d%n",laskeKirjaimet("kissa",'k'));
        System.out.printf("%d%n",laskeKirjaimet("kissa",'a'));
        System.out.printf("%d%n",laskeKirjaimet("kissa",'p'));
        System.out.printf("%d%n",laskeKirjaimet("a",'a'));
    }

}
