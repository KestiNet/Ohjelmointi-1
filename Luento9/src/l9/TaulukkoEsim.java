package l9;

/**
 * Ensimm‰inen esimerkki taulukoista
 * @author Esa Kesti
 * @version 25 Jun 2020
 */
public class TaulukkoEsim {
    
    /**
     * tulostetaan taulukon alkiot yhdelle riville
     * @param taulukko
     */
    public static void tulostaTaulukko(int[] taulukko) {
        int i = 0; // k‰tev‰, jos lukum‰‰r‰ ei ole aluksi tiedossa        while (i < taulukko.length) {
            System.out.print(taulukko[i] + " ");
            i++;
            
        }
    
    
/**
 * @param taulukko
 */
public static void tulostaTaulukkoForeach(int[] taulukko) {
        for (int i : taulukko ) // k‰tev‰, jos pit‰‰ vain katsella arvoja, ei voi muuttaa taulukon arvoja
                    System.out.print(i + " ");
                    System.out.println();
    }
    
    /**
     * tulostetaan taulukon alkiot yhdelle riville
     * k‰ytt‰en for-silmukkaa
     * @param taulukko
     */
    public static void tulostaTaulukkoFor(int[] taulukko) {
        
        for (int i = 0; i < taulukko.length; i++ ) { // k‰tev‰ jos lukum‰‰r‰ on tiedossa ja arvoja pit‰‰ pysty‰ muuttamaan
            System.out.print(taulukko[i] + " ");
           
            
        }
        System.out.println();
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // indeksti         0   1   2   3   4
        int[] kPituudet = {31, 28, 31, 30, 30 }; //koko :5
        int huhtikuu = kPituudet[4-1];
        System.out.println("huhtkuussa on p‰ivi‰ " + huhtikuu);
        kPituudet[4] = 29;
        
        
        int[] kPituudet2;    // vain viitemuuttuja, ei taulukko (ei siis oliota)
        //kPituudet2 = {} ei voi en‰‰n alustaa taulukkoa n‰in
        
        kPituudet2 = new int [12];
        kPituudet2[0] = 31; //tammikuu
        kPituudet2[1] = 28; //helmikuu
        kPituudet2[10] = 31; //marraskuu
        kPituudet2[11] = 31; //joulukuu

        System.out.println(kPituudet);
        tulostaTaulukko(kPituudet);
        
        
        int [] luvut = {1, 45, 6, 8, 4, 2, 66};
        tulostaTaulukko(luvut);
        
        tulostaTaulukkoFor(luvut);
        
       

        }
    }


