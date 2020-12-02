package Demo4;

/**
 * @author Esa Kesti
 * @version 27 Jun 2020
 */
public class Kirjaimet {

    /**
     * @param args
     */
    public static void main(String[] args) {
        char pienena = 'a';
        char isona = Character.toLowerCase(pienena);
        System.out.println(pienena + " => " + isona); // a => A
        pienena = 't';
        isona = Character.toLowerCase(pienena);
        System.out.println(pienena + " => " + isona); // t => T
    }

}
