package l10;

/**
 * Silmukka esimerkkejä
 * @author Esa Kesti
 * @version 5 Jul 2020
 */
public class Silmukat {
    
    private static void tulostaLuku(int luku) {
        int i = luku;
        while (i <= 50) {
            System.out.println(i++);
            //voi myös laittaa i++; printlinen alle
        }
        int i2 = luku;
        do {
            System.out.println(i2);
            i2++;
        } while (i2 <= 5);
        
        for(int j = 2; j <= 5; j++)
            System.out.println(j);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        tulostaLuku(2);
      

    }

}
