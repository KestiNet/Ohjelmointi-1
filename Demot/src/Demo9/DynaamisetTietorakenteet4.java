package Demo9;

import static Demo7.Kirjaimet.laskeKirjaimet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @author esakesti
 *
 */
public class DynaamisetTietorakenteet4 {


    
    /**
     * Etsii tietorakenteesta missä sanassa on eniten valittuja kirjaimia
     * @param sanat2 
     * @param sanat tietorakenne jossa merkkijonoja
     * @param kirjain mitä haetaan
     * @return jono missä eniten merkkejä
     * @example
     * <pre name="test">
     * #import java.util.ArrayList;
     * #import java.util.List;
     * List<String> sanat2 = new ArrayList<String>();
     * etsiEnitenPaikka(sanat2, 'a') === -1;
     * sanat2.add("koira");
     * etsiEnitenPaikka(sanat2, 'a') === 0;
     * sanat2.add("syö");
     * sanat2.add("muonaa");
     * etsiEnitenPaikka(sanat2, 'a') === 2;
     * sanat2.add("ja");
     * etsiEnitenPaikka(sanat2, 's') === 1;
     * sanat2.add("tavaa");
     * sanat2.add("javaa");
     *     
     * </pre>
     */
    public static int etsiPisinSana( List<String> sanat2) {
        int parasPaikka = -1;
        int parasLkm = 0;
        for ( int i = 0; i < sanat2.size(); i++ ) {            
            String sana = sanat2.get(i);
            int lkm = laskeKirjaimet(sana, kirjain);
            if (lkm > parasLkm) {
                parasLkm = lkm;
                parasPaikka = i;
            }                
        }
        return parasPaikka;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
      
       
       List<String> sanat2 = new ArrayList<String>();
       sanat2.add("koira");
       sanat2.add("syö");
       sanat2.add("muonaa");
       sanat2.add("ja");
       sanat2.add("tavaa");
       sanat2.add("javaa");
       
       String sana2 = etsiPisinSana(sanat2);
       System.out.println(sana2);
       int lkm = sanat2.size();
       System.out.println(lkm);
       Collections.sort(sanat2);
       System.out.println(sanat2);
       
       int i = sanat2.indexOf("javaa");  // pienillä tavaa
       if ( i < 0 ) {
           System.out.println("Ei löydy");
           return;
       }
       
       sana2 = sana2.toUpperCase();
       sanat2.set(i, sana2);
       
       System.out.println(sanat2);
       sanat2.remove(sana2);
       System.out.println(sanat2);
       
    
       
       
    }

}