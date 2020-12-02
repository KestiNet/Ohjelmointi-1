package l10;

import l9.Pienin;

/**
 * Demonstroidaan aliohjelman kutsua toisesta projektista
 * @author Esa Kesti
 * @version 5 Jul 2020
 */
public class KutsuPienin {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        char pienena = Character.toLowerCase('K');
        double x = Math.PI/2;
        int min = Pienin.pienin(1, 2, 3);
        //vrt. Character.toLowerCase tai Math.PI;
        //sin(x)  Math.sin(x);
        
        //int min = pienin(1, 2, 3); // uudempi, vaihtoehtoinen tapa tuoda toinen luokka käyttöön
        

    }

}
