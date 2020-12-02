package Demo3;

import java.util.Scanner;

/**
 * Jono isona ja pienenä
 * @author vesal
 * @version 20.9.2008
 */
public class IsoPieni {

    private static final Scanner lukija = new java.util.Scanner(System.in);

    
    /**
     * Tulostetaan käyttäjä syöttämä jono isona ja pienenä.
     * @param args ei käytössä.
     */
    public static void main(String[] args) {
        System.out.print("Anna merkkijono >");
        String jono = lukija.nextLine();
        
        System.out.println("Jono isona   : " + jono.toUpperCase());
        System.out.println("Jono pienenä : " + jono.toLowerCase());
        
        int pituus = jono.length();
        if ( pituus > 3) pituus = 3;
        System.out.println("Jonon 3. ekaa: " + jono.substring(0,pituus));

    }

}
